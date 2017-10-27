package com.heaven7.test;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.heaven7.java.base.util.Objects;
import com.heaven7.java.base.util.SparseArray;
import com.heaven7.java.data.mediator.ListPropertyEditor;
import com.heaven7.java.data.mediator.support.gson.TypeHandler;
import com.heaven7.plugin.idea.data_mediator.test.FlowItem;
import com.heaven7.plugin.idea.data_mediator.test.FlowItem_$Impl;
import com.heaven7.plugin.idea.data_mediator.test.Student;
import com.heaven7.plugin.idea.data_mediator.test.TestParcelableData;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>This class is generated by Data-mediator framework. DON'T EDIT IT!!!</p>
 *  @author heaven7 */
@JsonAdapter($TestItem2$TypeAdapter.class)
public class TestItem2_$Impl extends FlowItem_$Impl implements TestItem2, FlowItem {
  static {
    TypeHandler.registerTypeAdapter(TestItem2_$Impl.class, new $TestItem2$TypeAdapter());
  }

  @Since(1.2)
  @Until(2.0)
  private Student testItem2_1;

  private String testItem2_2;

  private List<String> testItem2_3;

  private boolean testItem2_4;

  private int testItem2_5;

  private TestParcelableData testItem2_6;

  public TestItem2_$Impl() {
  }

  @Override
  public void clearProperties() {
    super.clearProperties();
    this.testItem2_2 = null;
    this.testItem2_3 = null;
    this.testItem2_6 = null;
    this.testItem2_4 = false;
    this.testItem2_5 = 0;
    this.testItem2_1 = null;
  }

  @Override
  public String toString() {
    Objects.ToStringHelper helper = Objects.toStringHelper(this)
        .add("testItem2_1", String.valueOf(this.testItem2_1))
        .add("testItem2_2", String.valueOf(this.testItem2_2))
        .add("testItem2_3", String.valueOf(this.testItem2_3))
        .add("testItem2_4", String.valueOf(this.testItem2_4))
        .add("testItem2_5", String.valueOf(this.testItem2_5))
        .add("testItem2_6", String.valueOf(this.testItem2_6));
    return helper.toString() + "#_@super_#" + super.toString();
  }

  public Student getTestItem2_1() {
    return testItem2_1;
  }

  public TestItem2 setTestItem2_1(Student testItem2_11) {
    this.testItem2_1 = testItem2_11;
    return this;
  }

  public String getTestItem2_2() {
    return testItem2_2;
  }

  public TestItem2 setTestItem2_2(String testItem2_21) {
    this.testItem2_2 = testItem2_21;
    return this;
  }

  public List<String> getTestItem2_3() {
    return testItem2_3;
  }

  public TestItem2 setTestItem2_3(List<String> testItem2_31) {
    this.testItem2_3 = testItem2_31;
    return this;
  }

  public ListPropertyEditor<? extends TestItem2, String> beginTestItem2_3Editor() {
    if (testItem2_3 == null) {
      testItem2_3 = new ArrayList<>();
    }
    return new ListPropertyEditor<TestItem2,String>(this, testItem2_3, null, null);
  }

  public boolean isTestItem2_4() {
    return testItem2_4;
  }

  public TestItem2 setTestItem2_4(boolean testItem2_41) {
    this.testItem2_4 = testItem2_41;
    return this;
  }

  public int getTestItem2_5() {
    return testItem2_5;
  }

  public TestItem2 setTestItem2_5(int testItem2_51) {
    this.testItem2_5 = testItem2_51;
    return this;
  }

  public TestParcelableData getTestItem2_6() {
    return testItem2_6;
  }

  public TestItem2 setTestItem2_6(TestParcelableData testItem2_61) {
    this.testItem2_6 = testItem2_61;
    return this;
  }

  public TestItem2 setXxx1(int xxx11) {
    return (TestItem2)super.setXxx1(xxx11);
  }

  public TestItem2 setDesc(List<String> desc1) {
    return (TestItem2)super.setDesc(desc1);
  }

  public TestItem2 setXxx4(int[] xxx41) {
    return (TestItem2)super.setXxx4(xxx41);
  }

  public TestItem2 setId(Student id1) {
    return (TestItem2)super.setId(id1);
  }

  public TestItem2 setXxx5(Integer[] xxx51) {
    return (TestItem2)super.setXxx5(xxx51);
  }

  public TestItem2 setXxx2(Integer xxx21) {
    return (TestItem2)super.setXxx2(xxx21);
  }

  public TestItem2 setSelected(boolean selected1) {
    return (TestItem2)super.setSelected(selected1);
  }

  public TestItem2 setName(String name1) {
    return (TestItem2)super.setName(name1);
  }

  public TestItem2 setXxx3(SparseArray<Integer> xxx31) {
    return (TestItem2)super.setXxx3(xxx31);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (getTestItem2_1() != null ? getTestItem2_1().hashCode() : 0);
    result = 31 * result + (getTestItem2_2() != null ? getTestItem2_2().hashCode() : 0);
    result = 31 * result + (getTestItem2_3() != null ? getTestItem2_3().hashCode() : 0);
    result = 31 * result + (isTestItem2_4() ? 1 : 0);
    result = 31 * result + getTestItem2_5();
    result = 31 * result + (getTestItem2_6() != null ? getTestItem2_6().hashCode() : 0);
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TestItem2_$Impl)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
     TestItem2_$Impl that = (TestItem2_$Impl) o;
    if (getTestItem2_1() != null ? !getTestItem2_1().equals(that.getTestItem2_1()) : that.getTestItem2_1() != null) {
      return false;
    }
    if (getTestItem2_2() != null ? !getTestItem2_2().equals(that.getTestItem2_2()) : that.getTestItem2_2() != null) {
      return false;
    }
    if (getTestItem2_3() != null ? !getTestItem2_3().equals(that.getTestItem2_3()) : that.getTestItem2_3() != null) {
      return false;
    }
    if (isTestItem2_4() != that.isTestItem2_4()) {
      return false;
    }
    if (getTestItem2_5() != that.getTestItem2_5()) {
      return false;
    }
    if (getTestItem2_6() != null ? !getTestItem2_6().equals(that.getTestItem2_6()) : that.getTestItem2_6() != null) {
      return false;
    }
    return true;
  }
}
