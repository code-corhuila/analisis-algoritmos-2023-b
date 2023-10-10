# Corte 2 - Parcial Análisis de Sistemas
- Fecha: 10-10-2023
- Hora: 6:00 - 8:00
- Entrega en Moodle dentro del tiempo establecido.

# Instrucciones
- Nombre del proyecto: ParcialCorte2_NumeroDocumentoEstudiante
- Opcional: Package: View (Esto es opcional y puede omitirse si no es necesario para el ejercicio)

# Lógica Proposicional

## Ejercicio 1

### Descripción
Debes crear un programa en Java que resuelva una proposición compuesta basada en las siguientes proposiciones simples:
- P: "María estudia matemáticas."
- Q: "Juan estudia ciencias."

### Casos a Evaluar
Se proporcionan los siguientes casos:
1. **Caso 1**: P es verdadera y Q es verdadera.
2. **Caso 2**: P es verdadera y Q es falsa.
3. **Caso 3**: P es falsa y Q es verdadera.
4. **Caso 4**: P es falsa y Q es falsa.

### Instrucciones
Debes resolver la proposición compuesta R en función de las proposiciones simples P y Q. Crea un programa en Java que determine si R es verdadera o falsa en cada uno de los casos proporcionados y muestra el resultado en la consola.

**Nota**: Recuerda utilizar el operador "O" (disyunción lógica) para plantear la proposición compuesta R, ya que se busca verificar si al menos una de las proposiciones simples es verdadera.

# Ejericio 2

### Descripción

## Un cliente realiza la compra de tres artículos. El almacén ofrece descuentos según las siguientes condiciones:

- El almacén ofrece un descuento del 20% sobre el total de la compra si, al momento de pasar los elementos, el valor a pagar del producto 1 es menor que el producto 2, y también si el producto 2 es menor que el producto 3.

- El almacén ofrece un descuento del 10% sobre el total de la compra si, al momento de pasar los elementos, el valor a pagar del producto 1 es mayor que el producto 2, pero menor que el producto 3.

- El almacén ofrece un descuento del 50% sobre el total de la compra si, al momento de pasar los elementos, el valor a pagar del producto 2 es mayor que el producto 3, pero menor que el producto 1.

- Finalmente, si el valor a pagar de los tres productos son iguales, se hace un descuento del 80% sobre el total de la compra.

## Nota, el valor a pagar de cada producto se calcula de la siguiente manera:
Valor del producto = Valor Unitario * Cantidad de productos

## Valor neto 
Valor neto = Suma del valor de cada prodcuto - Descuento de la factura

## Datos a mostrar
* Nombre del cliente
* Nombre del producto 1, 2 y 3
* Valor de cada producto (Este corresponde a cantidad * valor unitario)
* Valor antes de descuento
* Descuento
* Valor neto    

### Estas condiciones determinan los descuentos que el cliente recibirá en función de los valores a pagar de los tres productos al momento de la compra.

### Casos a Evaluar, comprueba si es cierto el descuento o nó. Se proporcionan los siguientes casos:
### Caso 1: Descuento del 20%
- **Nombre del cliente:** Juan Pérez
- **Nombre del producto 1:** Camisa
- **Nombre del producto 2:** Pantalón
- **Nombre del producto 3:** Zapatos
- **Valor unitario del producto 1:** $30
- **Valor unitario del producto 2:** $25
- **Valor unitario del producto 3:** $40
- **Cantidad de producto 1:** 2
- **Cantidad de producto 2:** 1
- **Cantidad de producto 3:** 1

### Caso 2: Descuento del 10%
- **Nombre del cliente:** María Rodríguez
- **Nombre del producto 1:** Libro
- **Nombre del producto 2:** Cuaderno
- **Nombre del producto 3:** Lápices
- **Valor unitario del producto 1:** $10
- **Valor unitario del producto 2:** $5
- **Valor unitario del producto 3:** $3
- **Cantidad de producto 1:** 3
- **Cantidad de producto 2:** 2
- **Cantidad de producto 3:** 5

### Caso 3: Descuento del 50%
- **Nombre del cliente:** Carlos López
- **Nombre del producto 1:** Smartphone
- **Nombre del producto 2:** Laptop
- **Nombre del producto 3:** Tableta
- **Valor unitario del producto 1:** $500
- **Valor unitario del producto 2:** $1000
- **Valor unitario del producto 3:** $300
- **Cantidad de producto 1:** 1
- **Cantidad de producto 2:** 1
- **Cantidad de producto 3:** 1

### Caso 4: Descuento del 80% (todos los valores iguales)
- **Nombre del cliente:** Ana Martínez
- **Nombre del producto 1:** Gafas de sol
- **Nombre del producto 2:** Gafas de sol
- **Nombre del producto 3:** Gafas de sol
- **Valor unitario del producto 1:** $50
- **Valor unitario del producto 2:** $50
- **Valor unitario del producto 3:** $50
- **Cantidad de producto 1:** 2
- **Cantidad de producto 2:** 2
- **Cantidad de producto 3:** 2

### Caso 5: Descuento del 10% (descuento mínimo)
- **Nombre del cliente:** Laura García
- **Nombre del producto 1:** Camiseta
- **Nombre del producto 2:** Pantalón
- **Nombre del producto 3:** Gorra
- **Valor unitario del producto 1:** $15
- **Valor unitario del producto 2:** $20
- **Valor unitario del producto 3:** $10
- **Cantidad de producto 1:** 2
- **Cantidad de producto 2:** 1
- **Cantidad de producto 3:** 3



# Ejemplo base  para la solución de los ejercicios
```java
public class MiClase {

    public static void main(String[] args) {
        // Código principal del programa
        System.out.println("Hola, mundo!");
    }
}
```

# Es importante que los estudiantes cumplan con los plazos de entrega establecidos en Moodle ¡Buena suerte!
