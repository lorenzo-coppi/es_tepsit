<%@ page import = "java.time.LocalDate" %>

<html>
	<body>
		<h3>Benvenuto Utente Curioso, questo è la mia prima JSP</h3>
		<h3>Oggi è il giorno <%= LocalDate.now()  %></h3>
		<a href = "http://localhost:8080/author.jsp">AUTORE</a>
	</body>	
</html>
