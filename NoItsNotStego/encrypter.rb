#! /usr/bin/env ruby

require 'openssl'

cipher = OpenSSL::Cipher::AES128.new(:ECB)
cipher.encrypt
cipher.random_key

encrypted = cipher.update(IO.read(ARGV[0]))
encrypted += cipher.final

IO.write("encrypted-file", encrypted)
