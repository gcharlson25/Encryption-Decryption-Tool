# Encryption Decryption Tool

## Overview

This Java tool processes text-based messages and transforms them using a configurable character-based key. Messages can be encrypted for secure transmission and later decrypted to recover the original content. Input and output are handled entirely through external text files. The encryption and decryption system simulates secure communication between a field operative and their superiors. This project emphasizes file I/O, string manipulation, and modular program design.

## Project Structure
```
EncryptDecrypt.java               // Handles encryption and decryption logic
EspionageRunner.java              // Main program execution and coordination
MessageFromSuperiors.txt          // Plaintext input message
EncryptedMessageFromSuperiors.txt // Encrypted output message
StatusUpdateFromSpy.txt           // Decrypted response message
key.txt                           // Character-based encryption key
```

## How It Works
- A plaintext message is read from an input file  
- A key file defines how characters are shifted during encryption  
- The message is encrypted character-by-character using the key  
- The encrypted message is written to an output file  
- The process is reversed to decrypt messages back to their original form  
- Formatting and multi-line text are preserved throughout the process  
