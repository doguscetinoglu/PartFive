//İlk 3 sorguyu tekrar eden veriler için de yapalım.

// -- actor tablosundan first_name sütununu al
//SELECT DISTINCT first_name FROM actor
//UNION ALL
//-- customer tablosundan first_name sütununu al
//SELECT DISTINCT first_name FROM customer;

// ----------------------------------------------------------------

// SELECT DISTINCT first_name FROM actor
//INTERSECT ALL
//SELECT DISTINCT first_name FROM customer;

// -------------------------------------------------------------------

// SELECT DISTINCT first_name FROM actor
//EXCEPT ALL
//SELECT DISTINCT first_name FROM customer;