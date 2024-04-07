<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="livredor.css">
    <title>FILL THIS FORM </title>
</head>
<body>
    <div><h1>Welcome to our exhibition</h1></div>
    <form action="<?php $_SERVEUR["PHP_SELF"];?>"method="post">
    <label for="name">Name</label><br/>
    <input type="text" id="name" name="name" />    
    <label for="email">Email</label><br/>
    <input type="email" id="email" name="email" required/>
    <label for="message">Message</label><br/>
    <textarea name="message" id="message" cols="30" rows="10" required>
</textarea>
<input type="submit" value="send" name="send"/>
</form>
<?php 
if(isset($_POST["send"])){
    $f=fopen("livredor.txt","a+");
    $ligne=date("d-M-Y").';'.$_POST["name"].';'.$_POST["email"].';'.$_POST[message]."\n";
    fputs($f,$ligne);
    fclose($f);
}
if(file_exists("livredor.txt")){
    $tab_visitors=file("livredor.txt");
    foreach($tab_visitors as $visitor){
    $t=explode(";",$visitor);
    echo $[1].'<br/>'.$t[3]. '<br/> Posted on '.$t[0].'<hr/>'
}
}
</body>
</html>