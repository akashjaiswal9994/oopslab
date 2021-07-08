import 'package:flutter/material.dart';
import 'dart:math';

void main() {
  runApp(
      MaterialApp(
    home: Scaffold(
      backgroundColor:Colors.teal,
      appBar: AppBar(
        title: Text('DICE'),
        backgroundColor: Colors.blueGrey,
      ),
      body: MainScreen(),
    ),

  ));
}
class MainScreen extends StatefulWidget {
  const MainScreen({Key? key}) : super(key: key);

  @override
  _MainScreenState createState() => _MainScreenState();
}

class _MainScreenState extends State<MainScreen> {
  int leftButton=1;
  int rightButton=4;
  int count =0;
  @override
  Widget build(BuildContext context) {
    return Center(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Row(
            children: [
              Expanded(
                // ignore: deprecated_member_use
                  child: FlatButton(onPressed: () {
                    setState(() {
                      leftButton=Random().nextInt(6)+1;
                      count++;
                    });
                  },
                    child: Image.asset('images/dice$leftButton.png'),
                  )
              ),
              Expanded(
                // ignore: deprecated_member_use
                  child: FlatButton(onPressed: () {
                    setState(() {
                      rightButton=Random().nextInt(6)+1;

                      count++;
                    });
                  },
                    child: Image.asset('images/dice$rightButton.png'),)
              ),
            ],
          ),
          Center(
            heightFactor:3.0,
            child: Container(
               height: 25.0,
              width: 250.0,
              padding: EdgeInsets.symmetric(vertical: 5.0,horizontal: 5.0),
              color: Colors.white,
              child: Text('number of time button pressed $count'),
            ),
          ),
          Center(
            heightFactor:1.0,
            child: Expanded(child:ElevatedButton(
              onPressed: () {

                setState(() {
                  count=0;
                });
              },
              child:Text('Reset'),
            ) ),
          ),
        ],
      ),

    );
  }
}




