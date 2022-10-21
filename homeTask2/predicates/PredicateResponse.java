package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

import preconditions.Response;

public class PredicateResponse {

	/**
	 * Method to display the response with status code as 400
	 * 
	 * @param resp
	 * @author Chauhan
	 */
	public static void responsesWithStatusAs400(ArrayList<Response> resp) {
		System.out.println("Responses with status code as 400: ");
		Predicate<Response> resPred = i -> i.getStatusCode() == 400;
		for (Response r : resp) {
			if (resPred.test(r)) {
				System.out.println(r.getResponseBody());
			}
		}

	}

	/**
	 * Method to display all the responses with JSON body
	 * 
	 * @param resp
	 * @author Chauhan
	 */
	public static void responsesWithTypeJson(ArrayList<Response> resp) {
		System.out.println();
		System.out.println("Responses with type JSON: ");
		Predicate<Response> resPred = i -> i.getResponseType().equalsIgnoreCase("Json");
		for (Response r : resp) {
			if (resPred.test(r)) {
				System.out.println(r.getResponseBody());
			}
		}

	}

	/**
	 * Method display all the responses with status as 400 and have a JSON body
	 * 
	 * @param resp
	 */
	public static void responsesWithTypeJsonandStatus400(ArrayList<Response> resp) {
		System.out.println();
		System.out.println("Responses with type JSON and status 400: ");
		Predicate<Response> p1 = i -> i.getResponseType().equalsIgnoreCase("Json");
		Predicate<Response> p2 = i -> i.getStatusCode() == 400;
		for (Response r : resp) {
			if (p1.and(p2).test(r)) {
				System.out.println(r.getResponseBody());
			}
		}

	}

	/**
	 * Method display all the responses with status as 400 or have a JSON body
	 * 
	 * @param resp
	 * @author Chauhan
	 */
	public static void responsesWithTypeJsonOrStatus400(ArrayList<Response> resp) {
		System.out.println();
		System.out.println("Responses with type JSON OR status 400: ");
		Predicate<Response> p1 = i -> i.getResponseType().equalsIgnoreCase("Json");
		Predicate<Response> p2 = i -> i.getStatusCode() == 400;
		for (Response r : resp) {
			if (p1.or(p2).test(r)) {
				System.out.println(r.getResponseBody());
			}
		}

	}

	/**
	 * Method to display the responses with status code other than 400
	 * 
	 * @param resp
	 * @author Chauhan
	 */
	public static void responsesWithStatusNotAs400(ArrayList<Response> resp) {
		System.out.println();
		System.out.println("Responses with status code Not as 400 are: ");
		Predicate<Response> resPred = i -> i.getStatusCode() == 400;
		for (Response r : resp) {
			if (resPred.negate().test(r)) {
				System.out.println(r.getResponseBody());
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<Response> responses = new ArrayList<Response>();
		responses.add(new Response("OK", 200, "TEXT"));
		responses.add(new Response("Status:Success, Message:User Created", 201, "JSON"));
		responses.add(new Response("Status:Error, Message:Server Down", 500, "JSON"));
		responses.add(new Response("Server Unavailable", 503, "TEXT"));
		responses.add(new Response("400 Bad Request", 400, "XML"));
		responses.add(new Response("Status:Error, Message:Access Denied", 400, "JSON"));

		// Task-6
		responsesWithStatusAs400(responses);

		// Task-7
		responsesWithTypeJson(responses);

		// Task-8
		responsesWithTypeJsonandStatus400(responses);

		// Task-9
		responsesWithTypeJsonOrStatus400(responses);

		// Task-10
		responsesWithStatusNotAs400(responses);

	}

}
