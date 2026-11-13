import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // Este widget es la raíz de tu aplicación.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // Este es el tema de tu aplicación.
        //
        // PRUEBA ESTO: Intenta ejecutar tu aplicación con "flutter run". Verás
        // que la aplicación tiene una barra de herramientas morada. Luego, sin cerrar la aplicación,
        // intenta cambiar el seedColor en el colorScheme de abajo a Colors.green
        // y luego invoca "hot reload" (guarda tus cambios o presiona el botón "hot
        // reload" en un IDE compatible con Flutter, o presiona "r" si usaste
        // la línea de comandos para iniciar la aplicación).
        //
        // Observa que el contador no volvió a cero; el estado de la aplicación
        // no se pierde durante la recarga. Para reiniciar el estado, usa hot
        // restart en su lugar.
        //
        // Esto también funciona para el código, no solo para los valores: la mayoría de los cambios de código se pueden
        // probar simplemente con un hot reload.
        colorScheme: .fromSeed(seedColor: Colors.green),
      ),
      home: const MyHomePage(title: 'Nuevo titulo '),
    );
  }
}














class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  // Este widget es la página de inicio de tu aplicación. Tiene estado (stateful), lo que significa
  // que tiene un objeto State (definido abajo) que contiene campos que afectan
  // cómo se ve.

  // Esta clase es la configuración para el estado. Mantiene los valores (en este
  // caso el título) proporcionados por el padre (en este caso el widget App) y
  // usados por el método build del State. Los campos en una subclase de Widget
  // siempre se marcan como "final".

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}
















class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      // Esta llamada a setState le indica al framework de Flutter que algo ha
      // cambiado en este State, lo que hace que vuelva a ejecutar el método build de abajo
      // para que la pantalla pueda reflejar los valores actualizados. Si cambiáramos
      // _counter sin llamar a setState(), entonces el método build no se
      // volvería a llamar, y por lo tanto parecería que no pasa nada.
      _counter--;
    });
  }

  @override
  Widget build(BuildContext context) {
    // Este método se vuelve a ejecutar cada vez que se llama a setState, por ejemplo como lo hace
    // el método _incrementCounter de arriba.
    //
    
    ElevatedButton(
      onPressed: (){
        _counter++;
      }
      child: Text('Pulsame'),
    )
    
    
    
    // El framework de Flutter ha sido optimizado para hacer que volver a ejecutar los métodos build
    // sea rápido, de modo que puedas reconstruir solo lo que necesita actualizarse en lugar
    // de tener que cambiar individualmente las instancias de los widgets.
    return Scaffold(
      appBar: AppBar(
        // PRUEBA ESTO: Intenta cambiar el color aquí a un color específico (¿a
        // Colors.amber, quizás?) y activa un hot reload para ver cómo el AppBar
        // cambia de color mientras que los demás colores permanecen iguales.
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        // Aquí tomamos el valor del objeto MyHomePage que fue creado por
        // el método App.build, y lo usamos para establecer el título de nuestra appbar.
        title: Text(widget.title),
      ),
      body: Center(
        // Center es un widget de diseño (layout). Toma un único hijo y lo posiciona
        // en el medio del padre.
        child: Column(
          // Column también es un widget de diseño (layout). Toma una lista de hijos y
          // los organiza verticalmente. Por defecto, ajusta su tamaño para encajar con sus
          // hijos horizontalmente, e intenta ser tan alto como su padre.
          //
          // Column tiene varias propiedades para controlar cómo ajusta su tamaño y
          // cómo posiciona a sus hijos. Aquí usamos mainAxisAlignment para
          // centrar los hijos verticalmente; el eje principal aquí es el eje
          // vertical porque las Column son verticales (el eje transversal sería
          // horizontal).
          //
          // PRUEBA ESTO: Invoca "debug painting" (elige la acción "Toggle Debug Paint"
          // en el IDE, o presiona "p" en la consola), para ver el
          // esquema (wireframe) de cada widget.
          mainAxisAlignment: .center,
          children: [
            const Text('You have pushed the button this many times:'),
            Text(
              '$_counter',
              style: Theme.of(context).textTheme.headlineMedium,
            ),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        child: const Icon(Icons.add),
      ),
    );
  }
}
