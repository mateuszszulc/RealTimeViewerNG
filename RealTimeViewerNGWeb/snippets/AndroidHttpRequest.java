HttpClient httpclient = new DefaultHttpClient();
HttpResponse response = httpclient.execute(new HttpGet(URL));
StatusLine statusLine = response.getStatusLine();
if(statusLine.getStatusCode() == HttpStatus.SC_OK){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
response.getEntity().writeTo(out);
out.close();
String responseString = out.toString();
//..more logic
} else{
        //Closes the connection.
        response.getEntity().getContent().close();
throw new IOException(statusLine.getReasonPhrase());
}