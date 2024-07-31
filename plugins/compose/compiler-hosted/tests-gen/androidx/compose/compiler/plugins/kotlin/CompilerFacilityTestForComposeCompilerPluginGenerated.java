/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package androidx.compose.compiler.plugins.kotlin;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link androidx.compose.compiler.plugins.kotlin.TestGeneratorKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/compose/compiler-hosted/testData/codegen")
@TestDataPath("$PROJECT_ROOT")
public class CompilerFacilityTestForComposeCompilerPluginGenerated extends AbstractCompilerFacilityTestForComposeCompilerPlugin {
  @Test
  public void testAllFilesPresentInCodegen() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/compose/compiler-hosted/testData/codegen"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("constExprInitializer.kt")
  public void testConstExprInitializer() {
    runTest("plugins/compose/compiler-hosted/testData/codegen/constExprInitializer.kt");
  }

  @Test
  @TestMetadata("dataClass.kt")
  public void testDataClass() {
    runTest("plugins/compose/compiler-hosted/testData/codegen/dataClass.kt");
  }

  @Test
  @TestMetadata("interface.kt")
  public void testInterface() {
    runTest("plugins/compose/compiler-hosted/testData/codegen/interface.kt");
  }

  @Test
  @TestMetadata("lazyPropertyBackingField.kt")
  public void testLazyPropertyBackingField() {
    runTest("plugins/compose/compiler-hosted/testData/codegen/lazyPropertyBackingField.kt");
  }

  @Test
  @TestMetadata("multiModulesWithComposableFunction.kt")
  public void testMultiModulesWithComposableFunction() {
    runTest("plugins/compose/compiler-hosted/testData/codegen/multiModulesWithComposableFunction.kt");
  }

  @Test
  @TestMetadata("nestedLambda.kt")
  public void testNestedLambda() {
    runTest("plugins/compose/compiler-hosted/testData/codegen/nestedLambda.kt");
  }

  @Test
  @TestMetadata("propertyGetterBody.kt")
  public void testPropertyGetterBody() {
    runTest("plugins/compose/compiler-hosted/testData/codegen/propertyGetterBody.kt");
  }

  @Test
  @TestMetadata("propertyWithDelegateBackingField.kt")
  public void testPropertyWithDelegateBackingField() {
    runTest("plugins/compose/compiler-hosted/testData/codegen/propertyWithDelegateBackingField.kt");
  }
}
