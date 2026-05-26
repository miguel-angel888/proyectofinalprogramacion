Informe Proyecto Final – InmoSmart

1. Abstracción (Diagrama de clases)

Para el desarrollo del sistema InmoSmart se identificaron las entidades principales involucradas en el proceso inmobiliario. 
Estas representan los elementos fundamentales del negocio y permiten modelar el funcionamiento de la plataforma.

Entidades identificadas
Empresa,
Usuario,
Comprador,
Vendedor,
inueble,
Publicación,
Oferta,
Transacción,
Notificacion



2. Descomposición



El problema se dividió en varios módulos para facilitar su análisis, diseño e implementación. Cada módulo se encarga de una parte específica del sistema inmobiliario:

Usuario manejo de registro, inicio de sesión y administración de compradores y vendedores
Inmuebles: Gestión de publicación edición, búsqueda y visualización de propiedades
ofertas permite que los compradores realicen ofertas sobre los inmuebles publicados
Transcciones: Procesa la compra del inmueble y registra la operación realizada
reportes: genera consultas e información sobre usuarios, inmuebles, compras y ventas realizadas.

De esta manera cada parte del sistema se desarrolla de forma independiente pero trabajando en conjunto dentro de la plataforma



4. Codificación

La implementación del sistema fue desarrollada en Java aplicando los principios de Programación Orientada a Objetos

Se utilizaron:

Clases para representar entidades del sistema.
Objetos para crear compradores, vendedores, inmuebles y ofertas.
Herencia mediante Usuario, Comprador y Vendedor.
Polimorfismo para reutilizar comportamientos con diferente implementación según el contexto.

El código fuente fue almacenado en GitHub como repositorio principal del proyecto.


5. Pruebas del Sistema

Se realizaron pruebas funcionales sobre las principales operaciones del sistema.


Registro de usuarios
Se verificó que compradores y vendedores puedan registrarse correctamente.


Publicación de inmuebles
Se comprobó que un vendedor pueda publicar inmuebles con toda su información asociada.


Compra de inmuebles
Se verificó el proceso completo de comrp´ra


Generación de reportes
Se probaron consultas relacionadas con:


vendedores con más publicaciones
compradores con mas inmuebles comprados



6. Análisis Técnico

Abstracción
Se representaron conceptos del mundo real mediante clases como usuario inmueble y Oferta y Transacción,que permitieron entender el problema
desde ub punto de vista diferente y permitio un mejor entendimiento  y comprension de las entidades requeridads pára la realizacion del proyecto de InmoSmart


Encapsulamiento
Los atributos fueron declarados privados y manipulados mediante getters y setters, garantizando seguridad y control de acceso a los datos. 
Por otro lado se usaron metodos distintos a los getters y setters para ayudar a la realizacion de otros metodos o de funcionalidades especificas en ciertas clases. 


Herencia
Se implementó mediante la clase Usuario, de la cual heredan Comprador y Vendedor, esto permitio resumir y comprender de una mejor manera el codigo, 
lo cual tambein me facilito resumir y hacer mas entendible tanto la parte de la codificacion y la creacion del diagrama de clases que use para la realizacin de este proyecto


Polimorfismo
Se aplicó permitiendo que distintos objetos respondan de forma diferente ante un mismo método según su tipo. Cabe recalcar que grafias a la herencia de Usario a Comprador y vendedor permitio realizar
metodos absrtractos que facilitaron la codigficacion de las tres clases, tanto la padre como las hijas. tambien disminuyo bastante el riegsgo de erroires al momento de escribir nuevo codigo.

Interfaces
Se utilizaron interfaces para definir comportamientos comunes relacionados con operaciones inmobiliarias como:

publicar inmueble
comprar inmueble

El uso de esta interface facilito enormemente la creacion del sistema y los metodos o funcionalidades que unas clases podian tener en comun, 
ayudo a entender y recortar tiempo al momento de la creacion de las clases Vendedoor y comprador ya queno era escribir codigo de la nada sino 
que ya se contaba con una base solida pera la creacion de ciertos metodos y fuincionalidades.

5.Conclusion

El desarrollo de InmoSmart permitió aplicar de manera práctica los conceptos fundamentales de la Programación Orientada a Objetos mediante la creación de una plataforma inmobiliaria funcional.
A lo largo del proyecto fue posible analizar el problema, diseñar su estructura mediante diagramas de clases e implementar cada funcionalidad en Java.
Durante el proceso se pusieron en práctica principios como abstracción, encapsulamiento, herencia, polimorfismo e interfaces,
los cuales facilitaron la organización del código, su reutilización y una mejor comprensión del sistema. Además, las pruebas realizadas permitieron comprobar el correcto funcionamiento de procesos 
como el registro de usuarios y la publicación  y compra de inmuebles.
Finalmente, este proyecto permitió comprender mejor cómo modelar una situación real dentro de intellig IDEA, fortaleciendo tanto la lógica de programación como el diseño orientado a objetos
aplicado a un caso práctico como una plataforma inmobiliaria digital.
