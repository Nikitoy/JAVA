<?PHP
$hostname="localhost";
$database="dbmoria";
$username="";
$password="";
$json=array();
    if(isset($_GET["username"]) && isset($_GET["password"])){
        $username=$_GET['username'];
        $password=$_GET['password'];

        $conexion=mysqli_connect($hostname,"moriausr","moriapwd",$database);
        /*SELECT username, password FROM login WHERE username= "borja" AND password = "12345"*/
        $consulta="SELECT username, password FROM login WHERE username= '{$username}' AND password = '{$password}'";
        $resultado=mysqli_query($conexion,$consulta);

        if($consulta){

            if($reg=mysqli_fetch_array($resultado)){
                $json['datos'][]=$reg;
            }
            mysqli_close($conexion);
            echo json_encode($json);
        }
        else{
            $results["username"]='';
            $results["password"]='';
            $json['datos'][]=$results;
            echo json_encode($json);

        }

    }
    else{
            $results["username"]='';
            $results["password"]='';
            $json['datos'][]=$results;
            echo json_encode($json);

        }
?>
