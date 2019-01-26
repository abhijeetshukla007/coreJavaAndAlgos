package com.core.java.hiring.challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

public class Solution {
	/*
	 * Complete the function below.
	 */
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		// sol.sendGet("spiderman");
		getMovieTitles("spiderman");
	}

	static String[] getMovieTitles(String substr) throws Exception {
		Result result = null;
		Solution sol = new Solution();
		List<String> outputList = new ArrayList<>();

		result = sol.sendGet(substr);
		int pages = Integer.parseInt(result.getTotal_pages());

		int i = 1;
		while (i != pages + 1) {
			result = sol.sendGet(substr + "&page=" + i);
			result.getData().stream().forEach(d -> {
				outputList.add(d.getTitle());
			});
			i++;
		}

		System.out.println(outputList.size());
		Collections.sort(outputList);
		System.out.println("Sorted" + outputList);

		String[] strArr = outputList.toArray(new String[0]);

		return strArr;

	}

	private Result sendGet(String substr) throws Exception {

		String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr;

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestMethod("GET");

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		Gson gson = new Gson();
		Result result = gson.fromJson(response.toString(), Result.class);
		return result;
	}

	class Result {
		private String total;

		private String per_page;

		private String page;

		private List<Data> data;

		private String total_pages;

		public String getTotal() {
			return total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public String getPer_page() {
			return per_page;
		}

		public void setPer_page(String per_page) {
			this.per_page = per_page;
		}

		public String getPage() {
			return page;
		}

		public void setPage(String page) {
			this.page = page;
		}

		public List<Data> getData() {
			return data;
		}

		public void setData(List<Data> data) {
			this.data = data;
		}

		public String getTotal_pages() {
			return total_pages;
		}

		public void setTotal_pages(String total_pages) {
			this.total_pages = total_pages;
		}

		@Override
		public String toString() {
			return "Result [total = " + total + ", per_page = " + per_page + ", page = " + page + ", data = " + data
					+ ", total_pages = " + total_pages + "]";
		}
	}

	class Data {
		private String Year;

		private String Type;

		private String Poster;

		private String imdbID;

		private String Title;

		public String getYear() {
			return Year;
		}

		public void setYear(String Year) {
			this.Year = Year;
		}

		public String getType() {
			return Type;
		}

		public void setType(String Type) {
			this.Type = Type;
		}

		public String getPoster() {
			return Poster;
		}

		public void setPoster(String Poster) {
			this.Poster = Poster;
		}

		public String getImdbID() {
			return imdbID;
		}

		public void setImdbID(String imdbID) {
			this.imdbID = imdbID;
		}

		public String getTitle() {
			return Title;
		}

		public void setTitle(String Title) {
			this.Title = Title;
		}

		@Override
		public String toString() {
			return "ClassPojo [Year = " + Year + ", Type = " + Type + ", Poster = " + Poster + ", imdbID = " + imdbID
					+ ", Title = " + Title + "]";
		}
	}
}