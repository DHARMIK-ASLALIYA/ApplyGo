import 'package:flutter/material.dart';

class FFButtonWidget extends StatelessWidget {
  final String text;
  final VoidCallback? onPressed;
  final Icon? icon;
  final FFButtonOptions options;

  const FFButtonWidget({
    Key? key,
    required this.text,
    required this.onPressed,
    this.icon,
    required this.options,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      height: options.height,
      child: ElevatedButton(
        onPressed: onPressed,
        style: ElevatedButton.styleFrom(
          backgroundColor: options.color,
          padding: options.padding,
          elevation: options.elevation,
          shape: RoundedRectangleBorder(
            borderRadius: options.borderRadius,
            side: options.borderSide,
          ),
          alignment: options.alignment,
        ),
        child: Row(
          mainAxisSize: MainAxisSize.min,
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            if (icon != null) ...[
              Padding(
                padding: options.iconPadding,
                child: icon!,
              ),
              const SizedBox(width: 8), // Space between icon and text
            ],
            Text(
              text,
              style: options.textStyle,
            ),
          ],
        ),
      ),
    );
  }
}

class FFButtonOptions {
  final double height;
  final EdgeInsetsGeometry padding;
  final EdgeInsetsGeometry iconPadding;
  final Color color;
  final TextStyle textStyle;
  final double elevation;
  final BorderSide borderSide;
  final BorderRadius borderRadius;
  final Alignment alignment;

  const FFButtonOptions({
    required this.height,
    required this.padding,
    required this.iconPadding,
    required this.color,
    required this.textStyle,
    this.elevation = 2.0,
    this.borderSide = BorderSide.none,
    this.borderRadius = const BorderRadius.all(Radius.circular(8.0)),
    this.alignment = Alignment.center,
  });
}
