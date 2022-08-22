package org.azure.fn.premium;

import com.microsoft.azure.functions.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.*;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;


/**
 * Unit test for Function class.
 */
public class FunctionTest {
    private final static String tweetJson = "[{\"created_at\":\"Sat Mar 19 00:23:14 +0000 2022\",\"id\":1504976757102809091,\"id_str\":\"1504976757102809091\",\"text\":\"RT @MarkGaleotti: This is really interesting - the northern hemisphere is paying way too little attention to how the Ukraine war is playing\\u2026\",\"utils\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\/#!\\/download\\/ipad\\\" rel=\\\"nofollow\\\"\\u003eTwitter for iPad\\u003c\\/a\\u003e\",\"truncated\":false,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":719986561,\"id_str\":\"719986561\",\"name\":\"archgl\",\"screen_name\":\"archgl\",\"location\":null,\"url\":\"http:\\/\\/www.exitgames.com\",\"description\":\"Kodama, Data-Masks (the \\\"technological other\\\") -- Sterling Crispin. | \\u201cOut of intense complexities, intense simplicities emerge.\\u201d -- Winston Churchill.\",\"translator_type\":\"none\",\"protected\":false,\"verified\":false,\"followers_count\":301,\"friends_count\":5001,\"listed_count\":51,\"favourites_count\":90604,\"statuses_count\":17166,\"created_at\":\"Fri Jul 27 11:31:07 +0000 2012\",\"utc_offset\":null,\"time_zone\":null,\"geo_enabled\":false,\"lang\":null,\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"000000\",\"profile_background_image_url\":\"http:\\/\\/abs.twimg.com\\/images\\/themes\\/theme15\\/bg.png\",\"profile_background_image_url_https\":\"https:\\/\\/abs.twimg.com\\/images\\/themes\\/theme15\\/bg.png\",\"profile_background_tile\":false,\"profile_link_color\":\"4F5B5E\",\"profile_sidebar_border_color\":\"000000\",\"profile_sidebar_fill_color\":\"000000\",\"profile_text_color\":\"000000\",\"profile_use_background_image\":false,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/1415565620729585665\\/8ZtB_jkO_normal.jpg\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/1415565620729585665\\/8ZtB_jkO_normal.jpg\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/719986561\\/1647469571\",\"default_profile\":false,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null,\"withheld_in_countries\":[]},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"retweeted_status\":{\"created_at\":\"Fri Mar 18 21:51:28 +0000 2022\",\"id\":1504938561480630276,\"id_str\":\"1504938561480630276\",\"text\":\"This is really interesting - the northern hemisphere is paying way too little attention to how the Ukraine war is p\\u2026 https:\\/\\/t.co\\/PingkP7jrZ\",\"utils\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\/#!\\/download\\/ipad\\\" rel=\\\"nofollow\\\"\\u003eTwitter for iPad\\u003c\\/a\\u003e\",\"truncated\":true,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":280822613,\"id_str\":\"280822613\",\"name\":\"Mark Galeotti\",\"screen_name\":\"MarkGaleotti\",\"location\":\"London, England\",\"url\":\"http:\\/\\/inmoscowsshadows.wordpress.com\\/\",\"description\":\"Mayak Intelligence, @UCLSSEES, @RUSI_org, @IIR_Prague. Analyst of murky topics from Russian politics to global crime. Views my own\",\"translator_type\":\"none\",\"protected\":false,\"verified\":false,\"followers_count\":73037,\"friends_count\":318,\"listed_count\":1952,\"favourites_count\":3396,\"statuses_count\":19542,\"created_at\":\"Tue Apr 12 02:53:43 +0000 2011\",\"utc_offset\":null,\"time_zone\":null,\"geo_enabled\":true,\"lang\":null,\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"C0DEED\",\"profile_background_image_url\":\"http:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_image_url_https\":\"https:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_tile\":false,\"profile_link_color\":\"1DA1F2\",\"profile_sidebar_border_color\":\"C0DEED\",\"profile_sidebar_fill_color\":\"DDEEF6\",\"profile_text_color\":\"333333\",\"profile_use_background_image\":true,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/1196790504752648193\\/6WTTzv2U_normal.png\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/1196790504752648193\\/6WTTzv2U_normal.png\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/280822613\\/1638516928\",\"default_profile\":true,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null,\"withheld_in_countries\":[]},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"quoted_status_id\":1504896238826700800,\"quoted_status_id_str\":\"1504896238826700800\",\"quoted_status\":{\"created_at\":\"Fri Mar 18 19:03:17 +0000 2022\",\"id\":1504896238826700800,\"id_str\":\"1504896238826700800\",\"text\":\"When we say Kyiv is winning the information war, far too often we only mean information spaces we inhabit. \\n\\nPullin\\u2026 https:\\/\\/t.co\\/wVCpzNHIGi\",\"display_text_range\":[0,140],\"utils\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\/download\\/iphone\\\" rel=\\\"nofollow\\\"\\u003eTwitter for iPhone\\u003c\\/a\\u003e\",\"truncated\":true,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":351715132,\"id_str\":\"351715132\",\"name\":\"Carl Miller\",\"screen_name\":\"carljackmiller\",\"location\":null,\"url\":\"https:\\/\\/www.carlmiller.co\",\"description\":\"Author of a book about power in the digital age: http:\\/\\/amzn.to\\/2DNlZFi \\n\\nResearch Director, Centre for the Analysis of Social Media, Demos. Speaker.\",\"translator_type\":\"none\",\"protected\":false,\"verified\":true,\"followers_count\":19115,\"friends_count\":1198,\"listed_count\":510,\"favourites_count\":21656,\"statuses_count\":15251,\"created_at\":\"Tue Aug 09 16:58:51 +0000 2011\",\"utc_offset\":null,\"time_zone\":null,\"geo_enabled\":true,\"lang\":null,\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"C0DEED\",\"profile_background_image_url\":\"http:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_image_url_https\":\"https:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_tile\":false,\"profile_link_color\":\"1DA1F2\",\"profile_sidebar_border_color\":\"C0DEED\",\"profile_sidebar_fill_color\":\"DDEEF6\",\"profile_text_color\":\"333333\",\"profile_use_background_image\":true,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/1105149044912021512\\/uqH2pVSZ_normal.png\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/1105149044912021512\\/uqH2pVSZ_normal.png\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/351715132\\/1556822459\",\"default_profile\":true,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null,\"withheld_in_countries\":[]},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"is_quote_status\":false,\"extended_tweet\":{\"full_text\":\"When we say Kyiv is winning the information war, far too often we only mean information spaces we inhabit. \\n\\nPulling apart the most obvious RU info op to date (as we did using semantic modelling), very clear it is targeting BRICS, Africa, Asia. Not the West really at all. https:\\/\\/t.co\\/GA5KUQo77S\",\"display_text_range\":[0,272],\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[],\"symbols\":[],\"media\":[{\"id\":1504896233235783680,\"id_str\":\"1504896233235783680\",\"indices\":[273,296],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/FOJ3Jp3XoAAyeuB.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/FOJ3Jp3XoAAyeuB.jpg\",\"url\":\"https:\\/\\/t.co\\/GA5KUQo77S\",\"display_url\":\"pic.twitter.com\\/GA5KUQo77S\",\"expanded_url\":\"https:\\/\\/twitter.com\\/carljackmiller\\/status\\/1504896238826700800\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"medium\":{\"w\":1200,\"h\":673,\"resize\":\"fit\"},\"large\":{\"w\":1884,\"h\":1056,\"resize\":\"fit\"},\"small\":{\"w\":680,\"h\":381,\"resize\":\"fit\"}}}]},\"extended_entities\":{\"media\":[{\"id\":1504896233235783680,\"id_str\":\"1504896233235783680\",\"indices\":[273,296],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/FOJ3Jp3XoAAyeuB.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/FOJ3Jp3XoAAyeuB.jpg\",\"url\":\"https:\\/\\/t.co\\/GA5KUQo77S\",\"display_url\":\"pic.twitter.com\\/GA5KUQo77S\",\"expanded_url\":\"https:\\/\\/twitter.com\\/carljackmiller\\/status\\/1504896238826700800\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"medium\":{\"w\":1200,\"h\":673,\"resize\":\"fit\"},\"large\":{\"w\":1884,\"h\":1056,\"resize\":\"fit\"},\"small\":{\"w\":680,\"h\":381,\"resize\":\"fit\"}}}]}},\"quote_count\":141,\"reply_count\":44,\"retweet_count\":1001,\"favorite_count\":2080,\"entities\":{\"hashtags\":[],\"urls\":[{\"url\":\"https:\\/\\/t.co\\/wVCpzNHIGi\",\"expanded_url\":\"https:\\/\\/twitter.com\\/i\\/web\\/status\\/1504896238826700800\",\"display_url\":\"twitter.com\\/i\\/web\\/status\\/1\\u2026\",\"indices\":[117,140]}],\"user_mentions\":[],\"symbols\":[]},\"favorited\":false,\"retweeted\":false,\"possibly_sensitive\":false,\"filter_level\":\"low\",\"lang\":\"en\"},\"quoted_status_permalink\":{\"url\":\"https:\\/\\/t.co\\/SWVa6MG4oJ\",\"expanded\":\"https:\\/\\/twitter.com\\/carljackmiller\\/status\\/1504896238826700800\",\"display\":\"twitter.com\\/carljackmiller\\u2026\"},\"is_quote_status\":true,\"extended_tweet\":{\"full_text\":\"This is really interesting - the northern hemisphere is paying way too little attention to how the Ukraine war is playing in the global south, even without Russian info ops\",\"display_text_range\":[0,172],\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[],\"symbols\":[]}},\"quote_count\":2,\"reply_count\":16,\"retweet_count\":102,\"favorite_count\":220,\"entities\":{\"hashtags\":[],\"urls\":[{\"url\":\"https:\\/\\/t.co\\/PingkP7jrZ\",\"expanded_url\":\"https:\\/\\/twitter.com\\/i\\/web\\/status\\/1504938561480630276\",\"display_url\":\"twitter.com\\/i\\/web\\/status\\/1\\u2026\",\"indices\":[117,140]}],\"user_mentions\":[],\"symbols\":[]},\"favorited\":false,\"retweeted\":false,\"filter_level\":\"low\",\"lang\":\"en\"},\"quoted_status_id\":1504896238826700800,\"quoted_status_id_str\":\"1504896238826700800\",\"quoted_status\":{\"created_at\":\"Fri Mar 18 19:03:17 +0000 2022\",\"id\":1504896238826700800,\"id_str\":\"1504896238826700800\",\"text\":\"When we say Kyiv is winning the information war, far too often we only mean information spaces we inhabit. \\n\\nPullin\\u2026 https:\\/\\/t.co\\/wVCpzNHIGi\",\"display_text_range\":[0,140],\"utils\":\"\\u003ca href=\\\"http:\\/\\/twitter.com\\/download\\/iphone\\\" rel=\\\"nofollow\\\"\\u003eTwitter for iPhone\\u003c\\/a\\u003e\",\"truncated\":true,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":351715132,\"id_str\":\"351715132\",\"name\":\"Carl Miller\",\"screen_name\":\"carljackmiller\",\"location\":null,\"url\":\"https:\\/\\/www.carlmiller.co\",\"description\":\"Author of a book about power in the digital age: http:\\/\\/amzn.to\\/2DNlZFi \\n\\nResearch Director, Centre for the Analysis of Social Media, Demos. Speaker.\",\"translator_type\":\"none\",\"protected\":false,\"verified\":true,\"followers_count\":19115,\"friends_count\":1198,\"listed_count\":510,\"favourites_count\":21656,\"statuses_count\":15251,\"created_at\":\"Tue Aug 09 16:58:51 +0000 2011\",\"utc_offset\":null,\"time_zone\":null,\"geo_enabled\":true,\"lang\":null,\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"C0DEED\",\"profile_background_image_url\":\"http:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_image_url_https\":\"https:\\/\\/abs.twimg.com\\/images\\/themes\\/theme1\\/bg.png\",\"profile_background_tile\":false,\"profile_link_color\":\"1DA1F2\",\"profile_sidebar_border_color\":\"C0DEED\",\"profile_sidebar_fill_color\":\"DDEEF6\",\"profile_text_color\":\"333333\",\"profile_use_background_image\":true,\"profile_image_url\":\"http:\\/\\/pbs.twimg.com\\/profile_images\\/1105149044912021512\\/uqH2pVSZ_normal.png\",\"profile_image_url_https\":\"https:\\/\\/pbs.twimg.com\\/profile_images\\/1105149044912021512\\/uqH2pVSZ_normal.png\",\"profile_banner_url\":\"https:\\/\\/pbs.twimg.com\\/profile_banners\\/351715132\\/1556822459\",\"default_profile\":true,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null,\"withheld_in_countries\":[]},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"is_quote_status\":false,\"extended_tweet\":{\"full_text\":\"When we say Kyiv is winning the information war, far too often we only mean information spaces we inhabit. \\n\\nPulling apart the most obvious RU info op to date (as we did using semantic modelling), very clear it is targeting BRICS, Africa, Asia. Not the West really at all. https:\\/\\/t.co\\/GA5KUQo77S\",\"display_text_range\":[0,272],\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[],\"symbols\":[],\"media\":[{\"id\":1504896233235783680,\"id_str\":\"1504896233235783680\",\"indices\":[273,296],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/FOJ3Jp3XoAAyeuB.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/FOJ3Jp3XoAAyeuB.jpg\",\"url\":\"https:\\/\\/t.co\\/GA5KUQo77S\",\"display_url\":\"pic.twitter.com\\/GA5KUQo77S\",\"expanded_url\":\"https:\\/\\/twitter.com\\/carljackmiller\\/status\\/1504896238826700800\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"medium\":{\"w\":1200,\"h\":673,\"resize\":\"fit\"},\"large\":{\"w\":1884,\"h\":1056,\"resize\":\"fit\"},\"small\":{\"w\":680,\"h\":381,\"resize\":\"fit\"}}}]},\"extended_entities\":{\"media\":[{\"id\":1504896233235783680,\"id_str\":\"1504896233235783680\",\"indices\":[273,296],\"media_url\":\"http:\\/\\/pbs.twimg.com\\/media\\/FOJ3Jp3XoAAyeuB.jpg\",\"media_url_https\":\"https:\\/\\/pbs.twimg.com\\/media\\/FOJ3Jp3XoAAyeuB.jpg\",\"url\":\"https:\\/\\/t.co\\/GA5KUQo77S\",\"display_url\":\"pic.twitter.com\\/GA5KUQo77S\",\"expanded_url\":\"https:\\/\\/twitter.com\\/carljackmiller\\/status\\/1504896238826700800\\/photo\\/1\",\"type\":\"photo\",\"sizes\":{\"thumb\":{\"w\":150,\"h\":150,\"resize\":\"crop\"},\"medium\":{\"w\":1200,\"h\":673,\"resize\":\"fit\"},\"large\":{\"w\":1884,\"h\":1056,\"resize\":\"fit\"},\"small\":{\"w\":680,\"h\":381,\"resize\":\"fit\"}}}]}},\"quote_count\":141,\"reply_count\":44,\"retweet_count\":1001,\"favorite_count\":2080,\"entities\":{\"hashtags\":[],\"urls\":[{\"url\":\"https:\\/\\/t.co\\/wVCpzNHIGi\",\"expanded_url\":\"https:\\/\\/twitter.com\\/i\\/web\\/status\\/1504896238826700800\",\"display_url\":\"twitter.com\\/i\\/web\\/status\\/1\\u2026\",\"indices\":[117,140]}],\"user_mentions\":[],\"symbols\":[]},\"favorited\":false,\"retweeted\":false,\"possibly_sensitive\":false,\"filter_level\":\"low\",\"lang\":\"en\"},\"quoted_status_permalink\":{\"url\":\"https:\\/\\/t.co\\/SWVa6MG4oJ\",\"expanded\":\"https:\\/\\/twitter.com\\/carljackmiller\\/status\\/1504896238826700800\",\"display\":\"twitter.com\\/carljackmiller\\u2026\"},\"is_quote_status\":true,\"quote_count\":0,\"reply_count\":0,\"retweet_count\":0,\"favorite_count\":0,\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[{\"screen_name\":\"MarkGaleotti\",\"name\":\"Mark Galeotti\",\"id\":280822613,\"id_str\":\"280822613\",\"indices\":[3,16]}],\"symbols\":[]},\"favorited\":false,\"retweeted\":false,\"filter_level\":\"low\",\"lang\":\"en\",\"timestamp_ms\":\"1647649394666\"}]\n";
    @Test
    public void testHttpTriggerJava() throws Exception {
        // Setup
        @SuppressWarnings("unchecked")
        final HttpRequestMessage<Optional<String>> req = mock(HttpRequestMessage.class);
        final Optional<String> queryBody = Optional.of(tweetJson);
        doReturn(queryBody).when(req).getBody();

        doAnswer(new Answer<HttpResponseMessage.Builder>() {
            @Override
            public HttpResponseMessage.Builder answer(InvocationOnMock invocation) {
                HttpStatus status = (HttpStatus) invocation.getArguments()[0];
                return new HttpResponseMessageMock.HttpResponseMessageBuilderMock().status(status);
            }
        }).when(req).createResponseBuilder(any(HttpStatus.class));

        final ExecutionContext context = mock(ExecutionContext.class);
        doReturn(Logger.getGlobal()).when(context).getLogger();

        // Invoke
        final HttpResponseMessage ret = new Function().httpRun(req, context);

        // Verify
        assertEquals(ret.getStatus(), HttpStatus.OK);
    }
}