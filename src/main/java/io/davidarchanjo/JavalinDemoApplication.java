package io.davidarchanjo;

import io.javalin.Javalin;

public class JavalinDemoApplication {

	public static void main(String[] args) {
		Javalin app = Javalin.create();
		app.get("/", ctx -> ctx.result("Hello World from Javalin!"));
		app.start(8080);
	}
}