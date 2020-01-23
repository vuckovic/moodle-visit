package simulations

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.core.feeder._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://192.168.51.39")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.117 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_9 = Map("Origin" -> "http://192.168.51.39")

	val headers_18 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/json",
		"Origin" -> "http://192.168.51.39",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_33 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://192.168.51.39",
		"Upgrade-Insecure-Requests" -> "1")

	val uri2 = "https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.2"
	val csvFeeder = csv("/Volumes/DATA/Users/vuckovic/Programming/gatling3-fundamentals/src/test/resources/Data/Feeder.csv").circular

	val scn = scenario("RecordedSimulation")
		.exec(http("START_0")
			.get("/moodle/")
			.headers(headers_0)
			.resources(http("HOME_PAGE_1")
			.get("/moodle/lib/javascript.php/1577793796/lib/babel-polyfill/polyfill.min.js"),
            http("HOME_PAGE_2")
			.get("/moodle/lib/javascript.php/1577793796/lib/mdn-polyfills/polyfill.js"),
            http("HOME_PAGE_3")
			.get("/moodle/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.js"),
            http("HOME_PAGE_4")
			.get("/moodle/lib/javascript.php/1577793796/lib/javascript-static.js"),
            http("HOME_PAGE_5")
			.get("/moodle/theme/image.php/boost/core/1577793796/moodlelogo_grayhat"),
            http("HOME_PAGE_6")
			.get("/moodle/lib/javascript.php/1577793796/lib/requirejs/require.min.js"),
            http("HOME_PAGE_7")
			.get("/moodle/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.css"),
            http("HOME_PAGE_8")
			.get("/moodle/theme/styles.php/boost/1577793796_1/all"),
            http("HOME_PAGE_9")
			.get("/moodle/theme/font.php/boost/core/1577793796/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_9),
            http("CLICK_ON_COURSE_10")
			.get("/moodle/theme/image.php/boost/core/1577793796/t/collapsed"),
            http("CLICK_ON_COURSE_11")
			.get("/moodle/theme/image.php/boost/core/1577793796/t/collapsed_empty"),
            http("CLICK_ON_COURSE_12")
			.get("/moodle/theme/image.php/boost/core/1577793796/i/course"),
            http("CLICK_ON_COURSE_13")
			.get("/moodle/theme/yui_combo.php?m/1577793796/core/event/event-min.js&m/1577793796/filter_mathjaxloader/loader/loader-min.js"),
            http("CLICK_ON_COURSE_14")
			.get("/moodle/theme/yui_combo.php?m/1577793796/course/categoryexpander/categoryexpander-min.js"),
            http("CLICK_ON_COURSE_15")
			.get("/moodle/lib/requirejs.php/1577793796/core/first.js"),
            http("CLICK_ON_COURSE_16")
			.get("/moodle/lib/javascript.php/1577793796/lib/jquery/jquery-3.4.1.min.js"),
            http("CLICK_ON_COURSE_17")
			.get("/moodle/theme/yui_combo.php?3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js"),
            http("CLICK_ON_COURSE_18")
			.post("/moodle/lib/ajax/service.php?sesskey=UqCFMnP9Eb&info=core_fetch_notifications")
			.headers(headers_18)
			.body(RawFileBody("/Volumes/DATA/Users/vuckovic/Programming/simulations/recordedsimulation/0018_request.json"))))
		.pause(1)
		.exec(http("LOGIN_19")
			.get("/moodle/course/view.php?id=2")
			.headers(headers_0)
			.resources(http("LOGIN_20")
			.get("/moodle/lib/javascript.php/1577793796/lib/babel-polyfill/polyfill.min.js"),
            http("LOGIN_21")
			.get("/moodle/lib/javascript.php/1577793796/lib/mdn-polyfills/polyfill.js"),
            http("LOGIN_22")
			.get("/moodle/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.js"),
            http("LOGIN_23")
			.get("/moodle/lib/javascript.php/1577793796/lib/javascript-static.js"),
            http("LOGIN_24")
			.get("/moodle/lib/javascript.php/1577793796/lib/requirejs/require.min.js"),
            http("LOGIN_25")
			.get("/moodle/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.css"),
            http("LOGIN_26")
			.get("/moodle/theme/styles.php/boost/1577793796_1/all"),
            http("LOGIN_27")
			.get("/moodle/theme/font.php/boost/core/1577793796/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_9),
            http("LOGIN_28")
			.get("/moodle/theme/yui_combo.php?m/1577793796/core/event/event-min.js&m/1577793796/filter_mathjaxloader/loader/loader-min.js"),
            http("LOGIN_29")
			.get("/moodle/lib/requirejs.php/1577793796/core/first.js"),
            http("LOGIN_30")
			.get("/moodle/lib/javascript.php/1577793796/lib/jquery/jquery-3.4.1.min.js"),
            http("LOGIN_31")
			.get("/moodle/theme/yui_combo.php?3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js"),
            http("LOGIN_32")
			.post("/moodle/lib/ajax/service.php?sesskey=UqCFMnP9Eb&info=core_fetch_notifications")
			.headers(headers_18)
			.body(RawFileBody("/Volumes/DATA/Users/vuckovic/Programming/simulations/recordedsimulation/0032_request.json"))))
		.pause(7)
		.exec(http("FILLING_THE_LOGIN_SCREEN_33")
			.post("/moodle/login/index.php")
			.headers(headers_33)
			.formParam("anchor", "")
			.formParam("logintoken", "U1gOwdJdNMJ4oPCMW1uCUnLmQYqKbGM0")
			.formParam("username", "${username}")
			.formParam("password", "${password}")
			.resources(http("FILLING_THE_LOGIN_SCREEN_34")
			.get("/moodle/lib/javascript.php/1577793796/lib/mdn-polyfills/polyfill.js"),
            http("FILLING_THE_LOGIN_SCREEN_35")
			.get("/moodle/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.js"),
            http("FILLING_THE_LOGIN_SCREEN_36")
			.get("/moodle/lib/javascript.php/1577793796/lib/javascript-static.js"),
            http("FILLING_THE_LOGIN_SCREEN_37")
			.get("/moodle/course/view.php?id=2")
			.headers(headers_0),
            http("FILLING_THE_LOGIN_SCREEN_38")
			.get("/moodle/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.css"),
            http("FILLING_THE_LOGIN_SCREEN_39")
			.get("/moodle/theme/image.php/boost/core/1577793796/u/f2"),
            http("FILLING_THE_LOGIN_SCREEN_40")
			.get("/moodle/lib/javascript.php/1577793796/lib/requirejs/require.min.js"),
            http("FILLING_THE_LOGIN_SCREEN_41")
			.get("/moodle/theme/image.php/boost/core/1577793796/spacer"),
            http("FILLING_THE_LOGIN_SCREEN_42")
			.get("/moodle/theme/styles.php/boost/1577793796_1/all"),
            http("FILLING_THE_LOGIN_SCREEN_43")
			.get("/moodle/lib/javascript.php/1577793796/course/format/topics/format.js"),
            http("FILLING_THE_LOGIN_SCREEN_44")
			.get("/moodle/theme/image.php/boost/forum/1577793796/icon"),
            http("FILLING_THE_LOGIN_SCREEN_45")
			.get("/moodle/theme/image.php/boost/page/1577793796/icon"),
            http("FILLING_THE_LOGIN_SCREEN_46")
			.get("/moodle/theme/image.php/boost/core/1577793796/i/completion-manual-n"),
            http("FILLING_THE_LOGIN_SCREEN_47")
			.get("/moodle/theme/image.php/boost/quiz/1577793796/icon"),
            http("FILLING_THE_LOGIN_SCREEN_48")
			.get("/moodle/theme/font.php/boost/core/1577793796/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_9),
            http("COURSE_PAGE_49")
			.get("/moodle/theme/yui_combo.php?m/1577793796/core/event/event-min.js&m/1577793796/filter_mathjaxloader/loader/loader-min.js"),
            http("COURSE_PAGE_50")
			.get("/moodle/lib/javascript.php/1577793796/course/completion.js"),
            http("COURSE_PAGE_51")
			.get("/moodle/lib/requirejs.php/1577793796/core/first.js"),
            http("COURSE_PAGE_52")
			.get("/moodle/lib/javascript.php/1577793796/lib/jquery/jquery-3.4.1.min.js"),
            http("COURSE_PAGE_53")
			.get("/moodle/theme/yui_combo.php?3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js"),
            http("COURSE_PAGE_4")
			.post("/moodle/lib/ajax/service.php?sesskey=kHrpO5LRfL&info=core_fetch_notifications")
			.headers(headers_18)
			.body(RawFileBody("/Volumes/DATA/Users/vuckovic/Programming/simulations/recordedsimulation/0054_request.json")),
            http("COURSE_PAGE_5")
			.get(uri2 + "/MathJax.js?delayStartupUntil=configured"),
            http("COURSE_PAGE_56")
			.get(uri2 + "/config/Accessible.js?V=2.7.2"),
            http("COURSE_PAGE_57")
			.get(uri2 + "/config/Safe.js?V=2.7.2"),
            http("COURSE_PAGE_58")
			.get(uri2 + "/extensions/Safe.js?V=2.7.2")))
		.pause(1)
		.exec(http("COURSE_PAGE_59")
			.get("/moodle/mod/page/view.php?id=2")
			.headers(headers_0)
			.resources(http("COURSE_PAGE_60")
			.get("/moodle/lib/javascript.php/1577793796/lib/babel-polyfill/polyfill.min.js"),
            http("COURSE_PAGE_61")
			.get("/moodle/lib/javascript.php/1577793796/lib/mdn-polyfills/polyfill.js"),
            http("COURSE_PAGE_62")
			.get("/moodle/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.js"),
            http("COURSE_PAGE_63")
			.get("/moodle/lib/javascript.php/1577793796/lib/javascript-static.js"),
            http("COURSE_PAGE_64")
			.get("/moodle/theme/image.php/boost/core/1577793796/u/f2"),
            http("COURSE_PAGE_65")
			.get("/moodle/theme/yui_combo.php?rollup/3.17.2/yui-moodlesimple-min.css"),
            http("COURSE_PAGE_66")
			.get("/moodle/lib/javascript.php/1577793796/lib/requirejs/require.min.js"),
            http("COURSE_PAGE_67")
			.get("/moodle/theme/styles.php/boost/1577793796_1/all"),
            http("COURSE_PAGE_68")
			.get("/moodle/theme/font.php/boost/core/1577793796/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_9),
            http("COURSE_PAGE_69")
			.get("/moodle/theme/yui_combo.php?m/1577793796/core/event/event-min.js&m/1577793796/filter_mathjaxloader/loader/loader-min.js"),
            http("COURSE_PAGE_70")
			.get("/moodle/lib/requirejs.php/1577793796/core/first.js"),
            http("COURSE_PAGE_71")
			.get("/moodle/lib/javascript.php/1577793796/lib/jquery/jquery-3.4.1.min.js"),
            http("COURSE_PAGE_SCROLL_DOWN_72")
			.get("/moodle/theme/yui_combo.php?3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js"),
            http("COURSE_PAGE_SCROLL_DOWN_73")
			.post("/moodle/lib/ajax/service.php?sesskey=kHrpO5LRfL&info=core_fetch_notifications")
			.headers(headers_18)
			.body(RawFileBody("/Volumes/DATA/Users/vuckovic/Programming/simulations/recordedsimulation/0073_request.json"))))
		.pause(8)
		.exec(http("LOGOFF_74")
			.get("/moodle/login/logout.php?sesskey=kHrpO5LRfL")
			.headers(headers_0)
			.resources(http("LOGOFF_75")
			.get("/moodle/theme/font.php/boost/core/1577793796/fontawesome-webfont.woff2?v=4.7.0")
			.headers(headers_9),
            http("LOGOFF_76")
			.get("/moodle/theme/image.php/boost/core/1577793796/t/collapsed"),
            http("LOGOFF_77")
			.get("/moodle/theme/image.php/boost/core/1577793796/t/collapsed_empty"),
            http("LOGOFF_78")
			.get("/moodle/theme/image.php/boost/core/1577793796/i/course"),
            http("LOGOFF_79")
			.get("/moodle/theme/yui_combo.php?m/1577793796/core/event/event-min.js&m/1577793796/filter_mathjaxloader/loader/loader-min.js"),
            http("LOGOFF_80")
			.get("/moodle/theme/yui_combo.php?m/1577793796/course/categoryexpander/categoryexpander-min.js"),
            http("LOGOFF_81")
			.get("/moodle/lib/requirejs.php/1577793796/core/first.js"),
            http("LOGOFF_82")
			.get("/moodle/lib/javascript.php/1577793796/lib/jquery/jquery-3.4.1.min.js"),
            http("LOGOFF_83")
			.get("/moodle/theme/yui_combo.php?3.17.2/event-mousewheel/event-mousewheel-min.js&3.17.2/event-resize/event-resize-min.js&3.17.2/event-hover/event-hover-min.js&3.17.2/event-touch/event-touch-min.js&3.17.2/event-move/event-move-min.js&3.17.2/event-flick/event-flick-min.js&3.17.2/event-valuechange/event-valuechange-min.js&3.17.2/event-tap/event-tap-min.js"),
            http("LOGOFF_84")
			.post("/moodle/lib/ajax/service.php?sesskey=WM4j7WL1Yi&info=core_fetch_notifications")
			.headers(headers_18)
			.body(RawFileBody("/Volumes/DATA/Users/vuckovic/Programming/simulations/recordedsimulation/0084_request.json"))))

	setUp(scn.inject(atOnceUsers(5))).protocols(httpProtocol)
}