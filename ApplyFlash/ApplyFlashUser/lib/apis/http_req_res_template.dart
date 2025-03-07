import 'dart:convert';
import 'package:applyflashuser/widgets/custom_toast.dart';
import 'package:http/http.dart' as http;

class HttpRequestGeneralTemplate {
  final String url;
  final Map<String, String>? headers;
  final dynamic body;
  final int successCode;
  final Function? onStart;
  final Function? onSuccess;
  final Function? onProgress;
  final Function? onFailure;
  final Function? onError;
  final Function? onFinally;

  const HttpRequestGeneralTemplate({
    required this.url,
    this.headers = const {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
    },
    this.body,
    required this.successCode,
    this.onStart,
    this.onSuccess,
    this.onProgress,
    this.onFailure,
    this.onError,
    this.onFinally,
  });

  Future<void> post() async {
    try {
      if (onStart != null) onStart!();
      final response = await http.post(
        Uri.parse(url),
        headers: headers,
        body: jsonEncode(body),
      );
      if (response.statusCode == successCode) {
        if (onSuccess != null) onSuccess!();
      } else {
        if (onFailure != null) onFailure!();
        showCustomToast(jsonDecode(response.body)['message']);
      }
    } catch (e) {
      if (onError != null) onError!(e);
      showCustomToast('Failed to send request');
    } finally {
      if (onFinally != null) onFinally!();
    }
  }
}
