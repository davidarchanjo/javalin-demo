package io.davidarchanjo;

import io.javalin.Javalin;

public class JavalinDemoApplication {

	public static void main(String[] args) {
		Javalin app = Javalin.create().start(8080);
		app.get("/", ctx -> ctx.result("Hello World from Javalin!"));
	}
}