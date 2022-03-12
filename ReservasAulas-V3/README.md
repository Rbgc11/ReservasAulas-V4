# Tarea Reservas de Aulas
## Profesor: AndrÃ©s Rubio del RÃ­o
## Alumno: Rubén García Caparrós

Desde el IES Al-Ã�ndalus nos comentan que debemos tener en cuenta los siguientes aspectos:

- Las aulas se pueden reservar para una permanencia por tramo (de maÃ±ana o de tarde) o para una permanencia por horas. La permanencia por horas se harÃ¡ por horas en punto y no serÃ¡n anteriores a las 8:00h ni posteriores a las 22:00h.
- Si para un dÃ­a se realiza una reserva con permanencia por tramo, para ese dÃ­a no se podrÃ¡n hacer reservas por horas y viceversa.
- Las aulas deben tener informaciÃ³n sobre el nÃºmero de puestos de cada una.
- Las reservas no se pueden realizar para el mes en curso (sÃ³lo para el mes que viene o posteriores).
- Tampoco podemos anular una reserva a no ser que sea para el mes siguiente o posteriores.
- En el centro se lleva un sistema de puntos que cada profesor gasta al hacer una reserva:
    - Una permanencia por tramo restarÃ¡ 10 puntos.
    - Una permanencia por hora restarÃ¡ 3 puntos.
    - Un aula restarÃ¡ 0,5 puntos por el nÃºmero de puestos del aula.
    - Una reserva restarÃ¡ la suma del nÃºmero de puntos de la permanencia mÃ¡s el nÃºmero de puntos del aula.
    - Un profesor tiene disponibles cada mes 200 puntos por lo que si cuando va a realizar una reserva el nÃºmero de puntos gastados ese mes mÃ¡s el nÃºmero de puntos de la reserva que quiere realizar supera ese lÃ­mite no dejarÃ¡ realizar la reserva.
    
Por tanto, en este **tercer spring** abarcaremos todos estos requisitos. Para ello se propone seguir el siguiente diagrama de clases:   

![Diagrama de clases para reservasaulas](https://github.com/andresrubiodelrio/ReservasAulas-v2/blob/main/src/main/resources/reservasaulas.png)

He subido a GitHub un esqueleto de proyecto gradle que ya lleva incluidos todos los test necesarios que el programa debe pasar. Dichos test estÃ¡n todos comentados y deberÃ¡s ir descomentÃ¡ndolos conforme vayas avanzando con la tarea. La URL del repositorio es en la que te encuentras.

Por tanto, tu tarea va a consistir en completar los siguientes apartados:

1. Lo primero que debes hacer es realizar un **fork** del repositorio donde he colocado el proyecto gradle con la estructura del proyecto y todos los test necesarios.
2. Clona tu repositorio remoto reciÃ©n copiado en github a un repositorio local que serÃ¡ donde irÃ¡s realizando lo que a continuaciÃ³n se te pide. AÃ±ade tu nombre al fichero `README.md` en el apartado "Alumno". Haz tu primer commit.
3. Haz las modificaciones necesarias en la clase `Aula` para incluir el atributo puestos e implementar el mÃ©todo **getPuntos**. Haz un commit.
4. Haz las modificaciones necesarias en la clase `Profesor` para que dos profesores sean iguales si tienen el mismo correo. AdemÃ¡s, aÃ±ade un nuevo mÃ©todo llamado **getProfesorFicticio** que devuelve un profesor a partir de un correo del mismo.
5. Modifica la clase `Reserva` para aÃ±adir un mÃ©todo **getReservaFicticia** que a travÃ©s de un aula y de una permanencia recibidas como parÃ¡metros, obtenga un profesor ficticio y devuelve una reserva.
6. Convierte la clase `Permanencia` en una clase abstracta y haz que el mÃ©todo **getPuntos** sea abstracto. Esta clase sÃ³lo tendrÃ¡ como atributo el dÃ­a de la permanencia. Haz un commit.
7. Crea la clase `PermanenciaPorTramo` que herede de `Permanencia`, que implemente el mÃ©todo **getPuntos** y que posea el atributo **tramo**. Haz un commit.
8. Crea la clase `PermanenciaPorHora` que herede de `Permanencia`, que implemente el mÃ©todo **getPuntos** y que posea el atributo **hora**. Esta clase debe contemplar los requisitos expuestos en el enunciado para las horas. Haz un commit.
9. Haz las modificaciones necesarias en la clase Reserva para que
    - Un aula se pueda reservar por un profesor para una permanencia por tramo o por horas y que implemente el mÃ©todo **getPuntos**. Haz un commit.
    - Se tengan en cuenta las restricciones comentadas en el enunciado sobre no poder reservar aulas para el mes en curso y que no se sobrepase el lÃ­mite de puntos de un profesor para el mes en el que quiere realizar la reserva. Haz un commit.
10. Haz las modificaciones necesarias en la clase `Consola` para que se incluyan los mÃ©todos descritos a continuaciÃ³n:
    - **leerProfesorFicticio**, que a partir de un correo obtendrÃ¡ un profesor.Â Haz un commit.
    - **leerNumeroPuestos**, que lee el nÃºmero de puestos que va a tener un aula.Â Haz un commit.
    - **leerAulaFicticia**, que a partir de un nombre obtendrÃ¡ un objeto de tipo Aula. Haz un commit.
    - **leerHora**, que pedirÃ¡ al usuario una hora en formato HH:mm de la que se harÃ¡ uso en el caso de leer una permanencia por hora.Â Haz un commit.
    - **elegirPermanencia**, que permite elegir entre una permanencia por tramo o por hora.Â Haz un commit.
    - **leerPermanencia**, que en funciÃ³n de la permanencia elegidaÂ  por el usuario, devolverÃ¡ una permanencia de tipo tramo o de tipo hora, pidiendo toda la informaciÃ³n necesaria al usuario para tal fin.Â Haz un commit.
    - **leerReserva**, que a partir de un aula ficticia, de un profesor ficticio y de una permanencia, devuelve una reserva.Â Haz un commit.
    - **leerReservaFicticia**, que a partir de un aula ficticia y de una permanencia, devuelve reserva ficticia. Haz un commit.
11. Haz las modificaciones necesarias en la clase `Vista` para que:
    - Desde el mÃ©todo **realizarReserva** se haga uso del mÃ©todo **leerReserva** de la clase `Consola`, eliminando el mÃ©todo **leerReserva** de la clase Vista.Â Haz un commit.
    - Desde el mÃ©todo **anularReserva** se haga uso del mÃ©todo **leerReservaFicticia** de la clase `Consola`.Â Haz un commit.
    - Elimina el mÃ©todo **listarReservasPermanencia** ya que esta informaciÃ³n puede ser obtenida a travÃ©s de **listarReservas**.Â Haz un commit.
12. Modifica el Enum `Opcion` ya que la opciÃ³nÂ **listarReservasPermanencia** no estarÃ¡ disponible.Â Haz un commit.
13. Crea las interfaces para el **controlador, la vista y el modelo** y haz que se utilicen desde la aplicaciÃ³n principal. Haz un commit.

###### Se valorarÃ¡:
- La nomenclatura del repositorio de GitHub y del archivo entregado sigue las indicaciones de entrega.
- La indentaciÃ³n debe ser correcta en cada uno de los apartados.
- El nombre de las variables debe ser adecuado.
- Se debe utilizar la clase `Entrada` para realizar la entrada por teclado.
- El proyecto debe pasar todas las pruebas que van en el esqueleto del mismo y toda entrada del programa serÃ¡ validada para evitar que el programa termine abruptamente debido a una excepciÃ³n.
- Se deben utilizar los comentarios adecuados.
- Se valorarÃ¡ la correcciÃ³n ortogrÃ¡fica tanto en los comentarios como en los mensajes que se muestren al usuario.
