/*
 * Copyright (C) 2015  The Async BigTable Authors.  All rights reserved.
 * This file is part of Async BigTable.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *   - Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 *   - Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 *   - Neither the name of the StumbleUpon nor the names of its contributors
 *     may be used to endorse or promote products derived from this software
 *     without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.hbase.async;

/**
 * A leftover from early AsyncHBase days. This class should not be used and all
 * methods throw unsupported operation exceptions.
 * @deprecated
 */
public final class RowLockRequest extends HBaseRpc
  implements HBaseRpc.HasTable, HBaseRpc.HasKey {
  
  /**
   * CTor that always throws an UnsupportedOperationException as locking is
   * no longer supported
   * @param table Unused
   * @param key Unused
   * @throws UnsupportedOperationException all the time
   */
  public RowLockRequest(final byte[] table, final byte[] key) {
    throw new UnsupportedOperationException("Locking is not supported in BigTable");
  }

  /**
   * CTor that always throws an UnsupportedOperationException as locking is
   * no longer supported
   * @param table Unused
   * @param key Unused
   * @throws UnsupportedOperationException all the time
   */
  public RowLockRequest(final String table, final String key) {
    this(table.getBytes(), key.getBytes());
  }

  @Override
  public byte[] table() {
    return table;
  }

  @Override
  public byte[] key() {
    return key;
  }

}
