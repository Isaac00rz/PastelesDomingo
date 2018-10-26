
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>¿Que ofrecemos?</title>
        <style type="text/css">
            body{
                background: #CEF6F5;
                font-family:Trebuchet MS;
            }
            #volver{
                background-color:#088a86;
                -moz-border-radius:20px;
                -webkit-border-radius:20px;
                border-radius:28px;
                border:1px solid #088a86;
                display:inline-block;
                cursor:pointer;
                color:#ffffff;
                font-family:Trebuchet MS;
                font-size:14px;
                padding:10px 20px;
                text-decoration:none;
                text-shadow:0px 1px 0px #088a86;
            }
            #contenedor{
                padding: 0.5em;
                position: righ; position:relative;
                left: 20em; padding:1em;
                width: 35%; height: 220px;
                border: 4px solid #088A85;
                margin-top: 5em;
                background: white;
                border-radius: 10px;
                box-shadow: 5px 5px 5px 10px white;
            }
            #principal{
                padding: 0.5em;
                position: righ;
                position:relative;
                left: 15em;
                padding:1em;
                width: 60%;
                height: 950px;
                border: 4px solid #088A85;
                margin-top: 5em;
                background: white;
                border-radius: 10px;
                box-shadow: 5px 5px 5px 10px white;
            }
            #der,#derecha{
                float: right;
                width: 50%;
            }
            #izq,#izquierda{
                float:left;
                width: 50%;
            }
        </style>
    </head>
    <body>
        <div id="principal">
            <%--
            Declaraciones
            --%>
            <%  String p1 = "p1.jpg";
                String p2 = "p2.jpg";
                String p3 = "p3.jpg";
                String p4 = "p4.png";
                String p6 = "p5.jpg";
            %>
            <%--
            Scriptles
            --%>
            <h2>¿Qué ofrecemos?</h2>
            <br>
            <h3>Pasteles Isaac es una empresa sumamente comprometida con sus clientes, y la calidad de los productos
            que ofrecemos, más adelante le mostramos un poco de la variedad que ofrecemos</h3>
            <br>
            <br>
            <div id ="izq">
                <img src="<%=p1%>">
            </div>
            <div id="der"><p>
                    Es una tarta típica de la cocina de Baden y uno de los
                    dulces más preciados en la cocina alemana. Es una tarta de 
                    entre 25 y 30 cm de diámetro, compuesta por varias capas de 
                    bizcochuelo de chocolate embebido en kirsch e intercaladas
                    con nata y mermelada de cerezas. Está recubierta de crema
                    chantillí, virutas de chocolate y cerezas.
                </p></div>
            <br>
            <br>
            <br>
            <div id ="izq">
                <img src="<%=p2%>">
            </div>
            <div id="der"><p>
                    Es una tarta de chocolate típica de Austria consiste en dos
                    planchas gruesas de bizcocho de chocolate y mantequilla
                    separadas por una fina capa de mermelada de albaricoque y
                    recubiertas con un glaseado de chocolate negro por encima
                    y los lados.
                </p></div>
            <br>
            <br>
            <br>
            <div id ="izq">
                <img src="<%=p3%>">
            </div>
            <div id="der"><p>
                    Es típico en la repostería clásica española tener un dulce
                    en honor a un Santo o Patrón de un lugar, este tipo de
                    dulces se elaboraba en las fechas cercanas a su onomástica. 
                </p></div>
            <br>
            <br>
            <br>
            <div id ="izq">
                <img src="<%=p6%>">
            </div>
            <div id="der"><p>
                   El supuesto origen de este postre es variado aunque lo que 
                   prácticamente todos los historiadores suponen,
                   sin embargo, es que la receta se originó en algún lugar de 
                   América Latina, como una campaña promocional realizada por
                   una compañía productora de leche enlatada para aumentar
                   sus ventas.
                </p></div>
            <br>
            <br>
            <br>
            
            
            <br>
            <br>
            <div id="izquierda">
                <a href="index.xhtml" id="volver">Volver</a></div>
        </div>
    </body>
</html>