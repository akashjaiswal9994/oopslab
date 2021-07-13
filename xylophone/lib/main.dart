import 'package:flutter/material.dart';
import 'package:audioplayers/audioplayers.dart';

void main() {
  runApp(MyApp());
}
class MyApp extends StatelessWidget {
  Expanded playSound(int no,{required Color color}){
     return Expanded(
      child: Container(
        color: color,
        // ignore: deprecated_member_use
        child: FlatButton(onPressed: () {
          final player=AudioCache();
          player.play('assets_note$no.wav');
        },
          child: Text("click here"),),
      ),
    );

  }
  const MyApp({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.black,
        body: SafeArea(
          // ignore: deprecated_member_use
          child:Padding(
            padding: const EdgeInsets.all(16.0),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                playSound(1,color: Colors.red),
                playSound(2,color: Colors.green),
                playSound(3,color: Colors.tealAccent),
                playSound(4,color: Colors.orange),
                playSound(5,color: Colors.blue),
                playSound(6,color: Colors.brown),
                playSound(7,color: Colors.yellow),
              ],
            ),
          ),

        ),
      ),
    );
  }
}
