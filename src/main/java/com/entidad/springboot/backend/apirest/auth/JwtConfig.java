package com.entidad.springboot.backend.apirest.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA="alguna.clave.secreta.12345678";
	public static final String RSA_PRIVADA="-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAvsbDNLZTIR6K35h2GsnSmmm8iLIDiW7P6xFbn0DpgW80Pow3\r\n" + 
			"/vJjftw91h6hFYtT4nm5b1n9AKhiVkgitDCP5hdpEuoHWkr4Nu5fWoJ4bOCQCQ0G\r\n" + 
			"GETAAoWlIBqwygwaQy9J7cKFxQrTCpZisPrY682cHjYywImEBUnktp9az65TJoR6\r\n" + 
			"RT9tN8bjGNPFUgEXw+8gcnOrKgxJ3hK4hF73+aRB3bxdbdQuQMrVyEtJT5fhZPOA\r\n" + 
			"DSxWMR7DPo9AVUPObJOJKN3N75xW0OuDGq47Rn183GcGZo4RrAJI+bIU/UjPLz+D\r\n" + 
			"vnXc4uZem/tBjcojG9rohPqJz9cHgUJs8me3BwIDAQABAoIBAQC54VIrlwZSO78V\r\n" + 
			"8ygIG+M+no2bJs95ZeXh5Oy/s3CQs7hUxSx+FM/KuG7rpLZRForqHK4IB8cSj/4Y\r\n" + 
			"kXp21OYwS1kOm8YEPQ2x//oaZwtNElRk7TKmDL6E9pCYQklE5BvmoDnJFoJeJZjR\r\n" + 
			"NQv94rverVxSt34lyRdAS+oz4fqKZGFOv8QzX/z3odnVq9IZQaM7BASEhg0IwxIZ\r\n" + 
			"Wi+pnqJrSs5SrdgCH9Iz1BaZpMmmfL5wdqDqI7SGZ7MJFLBn8O3WVxwxr2O7nVEO\r\n" + 
			"Al0Pl7DZHtN0D6M62q81tlQVio2GncGtSjNF5KtjV29eLbxk5h2cqQDjFVsHG8RH\r\n" + 
			"eSSdJbpBAoGBAO1x5++0dwOL+rwBPjlusBOGrHSeyOAtfY60Zu7whgFuxCdkkugO\r\n" + 
			"ciDA+D5PEH8FwzZ4AwsOSPloicPcgIvpvAoQjbq9xP/WWvdXzE+9OFnplkaEtBj9\r\n" + 
			"QuNm+B1P4nGCgmvMUtJcWbEL/g2IAY2v1xEZoBlsZrKXRe3iex+VHrGnAoGBAM2v\r\n" + 
			"QES2+P5UU/l8mTENySaaQAf1F7Web5XIznMrqIRjXW/ZSX0BigGFhbpTWavFKRt2\r\n" + 
			"tACmI/19vlqAmo9HAZmV4cldHGItmexCQHvYcKmpVWlh9joI8Zfwg5o9BaYQlMtx\r\n" + 
			"JjiSunoOgIz/1E/FCPY/KETObK32LV1UI8V3o7uhAoGBAIkbk/U7PNnkc3UqNpcN\r\n" + 
			"TkkII/73TUD9o5nKnAFvC8I6BrREg/vRk59MLkw0dW8TkcSbCg7RQdwavCpH4kZo\r\n" + 
			"QjeBlYV2XRHp4f8fSI/m0GpC0o6HxEMFwyDybWTnovcuiEbc5hooT3ZHWXzQwyzg\r\n" + 
			"k4yBQoxLpwWLCksx0yzKe73TAoGAS3kzLAO3+hsXdUSzMbzNQsz3EfRtbsdkSqIU\r\n" + 
			"n041195eOtyQir411bkZCPXswYrnOpykEFjme+3YG311OX3kqGbHIwx3jc8N3BOz\r\n" + 
			"db5GGPt5y+GWaFU/0XD/2Wjq2bTb5Irwa3Hr2z3XDeYSEfNLBpDGRfk5B9x9aPGm\r\n" + 
			"7p6oBgECgYAR/i3bCfeXFLDOCl4M1P0oDAO/c4iu7vd0VBXLYimylEQkfgIGY7kU\r\n" + 
			"pGBRzIJk97v63ymVenhyBnGOfX23iWlhYVsPJuxRDOx8neQtg3+A6jy/GER9Kh49\r\n" + 
			"JEmogclavXUa/wzxoM93Ym815jQfKH8RuWJws8OzpkZlhhfRUxCtXg==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvsbDNLZTIR6K35h2GsnS\r\n" + 
			"mmm8iLIDiW7P6xFbn0DpgW80Pow3/vJjftw91h6hFYtT4nm5b1n9AKhiVkgitDCP\r\n" + 
			"5hdpEuoHWkr4Nu5fWoJ4bOCQCQ0GGETAAoWlIBqwygwaQy9J7cKFxQrTCpZisPrY\r\n" + 
			"682cHjYywImEBUnktp9az65TJoR6RT9tN8bjGNPFUgEXw+8gcnOrKgxJ3hK4hF73\r\n" + 
			"+aRB3bxdbdQuQMrVyEtJT5fhZPOADSxWMR7DPo9AVUPObJOJKN3N75xW0OuDGq47\r\n" + 
			"Rn183GcGZo4RrAJI+bIU/UjPLz+DvnXc4uZem/tBjcojG9rohPqJz9cHgUJs8me3\r\n" + 
			"BwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
