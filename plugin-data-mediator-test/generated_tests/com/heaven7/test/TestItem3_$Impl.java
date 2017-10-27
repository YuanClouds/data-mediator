package com.heaven7.test;

import com.google.gson.annotations.JsonAdapter;
import com.heaven7.java.base.util.Objects;
import com.heaven7.java.base.util.SparseArray;
import com.heaven7.java.data.mediator.support.gson.TypeHandler;
import com.heaven7.plugin.idea.data_mediator.test.Student;
import com.heaven7.plugin.idea.data_mediator.test.TestParcelableData;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

/**
 * <p>This class is generated by Data-mediator framework. DON'T EDIT IT!!!</p>
 *  @author heaven7 */
@JsonAdapter($TestItem3$TypeAdapter.class)
public class TestItem3_$Impl extends TestItem2_$Impl implements TestItem3, TestItem2 {
  static {
    TypeHandler.registerTypeAdapter(TestItem3_$Impl.class, new $TestItem3$TypeAdapter());
  }

  private String testItem3;

  public TestItem3_$Impl() {
  }

  @Override
  public void clearProperties() {
    super.clearProperties();
    this.testItem3 = null;
  }

  @Override
  public String toString() {
    Objects.ToStringHelper helper = Objects.toStringHelper(this)
        .add("testItem3", String.valueOf(this.testItem3));
    return helper.toString() + "#_@super_#" + super.toString();
  }

  public String getTestItem3() {
    return testItem3;
  }

  public TestItem3 setTestItem3(String testItem31) {
    this.testItem3 = testItem31;
    return this;
  }

  public TestItem3 setTestItem2_2(String testItem2_21) {
    return (TestItem3)super.setTestItem2_2(testItem2_21);
  }

  public TestItem3 setTestItem2_3(List<String> testItem2_31) {
    return (TestItem3)super.setTestItem2_3(testItem2_31);
  }

  public TestItem3 setTestItem2_6(TestParcelableData testItem2_61) {
    return (TestItem3)super.setTestItem2_6(testItem2_61);
  }

  public TestItem3 setTestItem2_4(boolean testItem2_41) {
    return (TestItem3)super.setTestItem2_4(testItem2_41);
  }

  public TestItem3 setSelected(boolean selected1) {
    return (TestItem3)super.setSelected(selected1);
  }

  public TestItem3 setName(String name1) {
    return (TestItem3)super.setName(name1);
  }

  public TestItem3 setXxx1(int xxx11) {
    return (TestItem3)super.setXxx1(xxx11);
  }

  public TestItem3 setDesc(List<String> desc1) {
    return (TestItem3)super.setDesc(desc1);
  }

  public TestItem3 setXxx4(int[] xxx41) {
    return (TestItem3)super.setXxx4(xxx41);
  }

  public TestItem3 setId(Student id1) {
    return (TestItem3)super.setId(id1);
  }

  public TestItem3 setXxx5(Integer[] xxx51) {
    return (TestItem3)super.setXxx5(xxx51);
  }

  public TestItem3 setTestItem2_5(int testItem2_51) {
    return (TestItem3)super.setTestItem2_5(testItem2_51);
  }

  public TestItem3 setXxx2(Integer xxx21) {
    return (TestItem3)super.setXxx2(xxx21);
  }

  public TestItem3 setTestItem2_1(Student testItem2_11) {
    return (TestItem3)super.setTestItem2_1(testItem2_11);
  }

  public TestItem3 setXxx3(SparseArray<Integer> xxx31) {
    return (TestItem3)super.setXxx3(xxx31);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (getTestItem3() != null ? getTestItem3().hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TestItem3_$Impl)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
     TestItem3_$Impl that = (TestItem3_$Impl) o;
    if (getTestItem3() != null ? !getTestItem3().equals(that.getTestItem3()) : that.getTestItem3() != null) {
      return false;
    }
    return true;
  }
}
