import 'package:flutter/material.dart';
import 'package:get/get.dart';
import '../configs/project_config.dart';

class FFButtonWidget extends StatelessWidget {
  final String text;
  final VoidCallback? onPressed;
  final Icon? icon;
  final FFButtonOptions options;
  final bool enableLoader;
  final RxBool? loaderController;

  const FFButtonWidget({
    super.key,
    required this.text,
    required this.onPressed,
    this.icon,
    required this.options,
    this.enableLoader = false,
    this.loaderController,
  });

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      height: options.height,
      child: Obx(() {
        bool isLoading = loaderController?.value ?? dummyController.dummy.value;
        return ElevatedButton(
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
              if (isLoading && enableLoader) ...[
                SizedBox(
                  width: 20,
                  height: 20,
                  child: CircularProgressIndicator(
                    strokeWidth: 2,
                    valueColor:
                        AlwaysStoppedAnimation<Color>(options.loaderColor!),
                  ),
                ),
                const SizedBox(width: 8),
              ] else if (icon != null) ...[
                Padding(
                  padding: options.iconPadding,
                  child: icon!,
                ),
                const SizedBox(width: 8),
              ],
              Text(
                text,
                style: options.textStyle,
              ),
            ],
          ),
        );
      }),
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
  final Color? loaderColor;

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
    this.loaderColor,
  });
}
