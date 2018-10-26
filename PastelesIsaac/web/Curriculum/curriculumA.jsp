
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Curriculum Isaac 3</title>
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
            <%  String p1 = "isaac3.jpg";
                String p2 = "p2.jpg";
                String p3 = "p3.jpg";
                String p4 = "p4.png";
                String p6 = "p5.jpg";
            %>
            <%--
            Scriptles
            --%>
            <h2>Curriculum vitae</h2>
            <br>
            <br>
            <br>
            <div id ="izq">
                <img src="<%=p1%>">
            </div>
            <div id="der"><p>
                    <h3>Abril Alejandra Santos Salas<br>
                    22/04/97<br>
                    alejandra.santos.97@hotmail.com<br>
                    Educacion:<br>
                               CONALEP Plantel Leon II (2012-2015)<br>
                               Instituto Tecnologico de Leon (2015-actualidad)<br>
                    Experiencia laboral:<br>
                                        ;D<br>
                    Virtudes:<br>
                              En busqueda... ;D<br>
                    Habilidades:<br>
                                Facilidad en ingles<br>
                                Disponibilidad</h3>
                    
                </p></div>
            <br>
            <br>
            <div id="izquierda">
                <a href="index.xhtml" id="volver">Volver</a></div>
        </div>
    </body>
</html>