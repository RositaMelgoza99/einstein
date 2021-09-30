
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import com.example.einsteinlib.R
import com.google.android.material.snackbar.Snackbar



class SnackbarLib {
    /**
     * Metodo que muestra un snackbar de duracion long en la vista requerida
     *
     * @param view    La vista donde se invocara el snackbar
     * @param mensaje El mensaje texto a mostrar
     */
     fun showSnackBarLong(view: View, mensaje: String?, backgroundColor: Int) {
        val snackbar = Snackbar.make(view, mensaje!!, Snackbar.LENGTH_LONG)
        val snackBarView: View = snackbar.view
        snackBarView.setBackgroundColor(backgroundColor)
        snackbar.show()
    }
   /*
    fun messageEmergent( ){
         val builder = AlertDialog.Builder(this )
        builder.setTitle("Autos")
        builder.setMessage("Bienvenidos a una aplicacion de autos")
        builder.setPositiveButton("OK", null)
        var  dialog: AlertDialog = builder.create()
        builder.show()

    }
*/
   fun hello( ): String {
    return "Hola bienvenidos ala aplicacion de autos"
    }
// SUMA
     fun add(firsNumber: Int, secondNumber: Int) : Int{
        val operation = firsNumber + secondNumber
          return operation
    }

     /*
    fun mainadd(args: Array<String>) {
        var result = add(5, 10)
        println(result)
    }

      */
  // Resta
     fun substract(number1:Int, number2:Int)
     = number1 - number2


    /*
   fun mainSubstract(args: Array<String>) {
        val result = substract(number1 = 20, number2 = 5)
        println("El resultado de la resta es $result")
        // El resultado de la resta es -15
    }

     */








}