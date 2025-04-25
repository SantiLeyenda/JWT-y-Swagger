# JWT-y-Swagger

Para correr la aplicación es necesario clonar el repositorio. 
Despúes, en la terminal ir a donde este su folder de LibraryManagement
Al estar ahi, escriba mvn spring-boot:run y la aplicación debería de correr en el puerto que tenga en el archivo de properties 
Ya que es local, no se tiene que preocupar por la base de datos. 


1. Swagger
- Al ver la pagina, vera que los endpoints tienen su descripción y si le pica al endpoint podra ver que parámetros necesita. También, podrá probar el endpoint



2. Secure the API
- Para ver el uso del JWT token, vaya al authlogin endpoint, ingrese admin para el usuario y admin123 para la contraseña. 
- Ahi abajo recibirá el JWT token, cópielo. 
- Vallase al endpoint de get, el que dice que regresa todos los libros y píquele al candado. 
- Ingrese el token y póngale a try it out y ejecutar. Vera que obtiene el código de 200 que es éxito.
- Ahora, haga clic en el candado otra vez y haga log out. 
- Ahora, meta cualquier valor y vallase al get otra vez e inténtelo.
- Si se va a la consola, vera que no es posible ya que su jwt no es valido. 
- También ahi en la aplicación, vera que sale 404 por el error. 
