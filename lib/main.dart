import 'package:flutter/material.dart';

void main() => runApp(
      MaterialApp(
        home: Scaffold(
          appBar: AppBar(),
          body: TextField(
            keyboardType: TextInputType.phone,
          ),
        ),
      ),
    );
