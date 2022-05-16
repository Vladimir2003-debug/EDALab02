<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Informe de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">ESTRUCTURAS DE DATOS Y ALGORITMOS</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Revision de Elementos de Programacion(I)</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>02</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>11-Mayo-2022</td><td>FECHA FIN:</td><td>16-Mayo-2022</td><td>DURACIÓN:</td><td>04 horas</td>
</tr>
<tr><td colspan="4">Alumnos:
<ul>
<li>Sulla Quispe Vladimir Arturo - vsullaq@unsa.edu.pe</li>
</ul>
</td>
    <td >Nota</td>
    <td colspan="1">    </td>
</<tr>
</tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
<tr><td colspan="6">RECURSOS:
    <ul>
        <li><a href="https://www.w3schools.com/java/">https://www.w3schools.com/java/</a></li>
        <li><a href="https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers">https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers</a></li>   
        <li><a href="https://docs.oracle.com/javase/7/docs/api/java/util/List.html">https://docs.oracle.com/javase/7/docs/api/java/util/List.html</a></li>
        <li><a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">https://docs.oracle.com/javase/tutorial/java/generics/types.html</a></li>
    </ul>
</td>
</<tr>
</tdbody>
</table>

 ## SOLUCION Y RESULTADOS
 Las ejercicios estan dentro de la carpeta src en donde las soluciones se dividen en los ejercicios simples que estan dentro de una clase Main.java en forma de metodos, y los TDA estan dentro de la carpeta/package List.
 I Solucion de Ejercicios<br>
 Ejercicio 1:Invertir una matriz
 El ejercicio se resolvio creando una nueva matriz, en donde se insertaban inversamente los elementos
 ![image](https://user-images.githubusercontent.com/83074130/168679116-e0350b52-27ed-40c5-a7b7-2b3b71b21c1c.png)
Ejercicio 2:Rotacion a la izquierda
El ejercicio inicia primero calculando el modulo del numero de casillas de dezplazamiento(d) con el largo del arreglo. Esto para evitar movimientos inecesarios si se quiere dezplazar una cantidad mayor que el largo del arreglo

Ejercicio 3:Triangulo Recursivo
El metodo inicia con el if que termina la recursividad
<br><code>
 if(n == 1)
            System.out.println("*");   
</code><br>

para luego en el else imprimir los puntos de abajo hasta arriba<br>

    trianguloRecursivo(n-1);
    for(int i = 0; i < n; i++)
    System.out.print("*");
    System.out.println();

Listas
- TDAList
Es la interface de arrayList y LinkedList se uso el nombre de TDA al inicio para que el IDE no diera problemas con la clase List.java dentro del java.util
- Node
la clase Node posee sus atributos: el dato del nodo y el nodo siguiente. Un objeto Node se puede crear mediante un dato simplemente o con el nodo que le sigue y su dato.
- ArrayList
Para la creacion de esta clase se tuvo que importar Collections de java.util ya que algunos metodos lo requieren. Para insertar elementos primero se evalua si la suma del elemento/elementos con el tamaño del arreglo superan la capacidad inicial en ese caso se trasladan los elementos del arreglo a otro arreglo del doble de tamaño.

- LinkedList
LinkedList trabaja con nodos enlazados. Esta clase tiene muchas diferencias con ArrayList por ejemplo si se quiere limpiar arrayList se mata cada item del arreglo, LinkedList solamente necesita matar al primer nodo para limpiarlo La manera de trabajr es simplement acoplar y desacoplar

 ## SOLUCION DEL CUESTIONARIO
 
- ¿Qué diferencia hay entre un List y un ArrayList en Java?
Un List es una interface que sirve como marco para las clases LinkedList y ArrayList. Estas dos clases ofrecen distintas formas de almacenamiento de datos pero con distinta forma y velocidad de acceso hacia ellos. por ejemplo arrayList se puede acceder a los datos directamente mediante un index sin embargo si se desbordara la capacidad al momento de ingresar los datos tendriamos que mover los elementos hacia otro arreglo, LinkedList pr otro lado no necesitar mudar elementos , sin embargo para acceder a los datos requiere caminar por todos los nodos hasta llegar al nodo deseado

- ¿Qué beneficios y oportunidades ofrecen las clases genéricas en Java?
Las clases genericas nos pueden servir para trabajr con datos desconocidos, el cliente puede usar cualquier tipo de objeto que el programador no conoce, claro que algunas veces no se puede trabajar con genericos como al crear arreglos estandarya que estos no trabajan directamente con genericos pero en el constructor de puede hacer un cast 

 ## CONCLUSIONES
 
 
 ## RETROALIMENTACION
 
 
 ## REFERENCIAS
- https://www.w3schools.com/java/
- https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
- https://docs.oracle.com/javase/7/docs/api/java/util/List.html
- https://docs.oracle.com/javase/tutorial/java/generics/types.html
- 
 
