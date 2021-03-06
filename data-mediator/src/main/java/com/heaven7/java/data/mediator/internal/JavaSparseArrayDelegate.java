/**
 * Copyright 2017
 group of data-mediator
 member: heaven7(donshine723@gmail.com)

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.heaven7.java.data.mediator.internal;

import com.heaven7.java.base.anno.Hide;
import com.heaven7.java.base.util.SparseArray;

/**
 * the sparse array on java .
 * @param <V> the value type.
 * @author heaven7
 */
@Hide
/*public*/ class JavaSparseArrayDelegate<V> implements SparseArrayDelegate<V> {

    private final SparseArray<V> mMap;

    public JavaSparseArrayDelegate(SparseArray<V> mMap) {
        this.mMap = mMap;
    }

    @Override
    public V put(int key, V value, int[] resultStateArr) {
        final V old = mMap.get(key);
        final int resultState;
        if(value == null){
            if(old == null){
                resultState = STATE_NO_CHANGE;
            }else{
                mMap.put(key, null);
                resultState = STATE_CHANGED;
            }
        }else{
            if(old == null){
                //new not null, old is null.
                mMap.put(key, value);
                resultState = STATE_NEW;
            }else if (value.equals( old )){
                //new not null, old is not null. but equals.
                resultState = STATE_NO_CHANGE;
            }else{
                mMap.put(key, value);
                resultState= STATE_CHANGED;
            }
        }
        if(resultStateArr != null){
            resultStateArr[0] = resultState;
        }
        return old;
    }

    @Override
    public V remove(int key) {
        return mMap.getAndRemove(key);
    }
    @Override
    public boolean removeByValue(V value, int[] keyArr){
        final int index = mMap.indexOfValue(value, false);
        if(index < 0){
            return false;
        }
        if(keyArr != null) {
            keyArr[0] = mMap.keyAt(index);
        }
        mMap.removeAt(index);
        return true;
    }

    @Override
    public int size() {
        return mMap.size();
    }

    @Override
    public int keyAt(int index) {
        return mMap.keyAt(index);
    }

    @Override
    public V valueAt(int index) {
        return mMap.valueAt(index);
    }

    @Override
    public void removeAt(int index) {
        mMap.removeAt(index);
    }

    @Override
    public void setValueAt(int index, V value) {
        mMap.setValueAt(index, value);
    }

    @Override
    public boolean clearTo(SparseArrayDelegate<V> out) {
        final int size = mMap.size();
        if(size == 0){
            return false;
        }
        if(out != null) {
            for (int i = size -1 ; i>=0 ; i--){
                out.put(mMap.keyAt(i), mMap.valueAt(i), null);
            }
        }
        mMap.clear();
        return true;
    }

    @Override
    public int indexOfValue(V value) {
        return mMap.indexOfValue(value ,false);
    }

    @Override
    public V get(int key) {
        return mMap.get(key);
    }
}
