SELECT a.firstName, a.lastName, b.city, b.state from Person as a 
LEFT JOIN Address as b ON a.personId = b.personId;