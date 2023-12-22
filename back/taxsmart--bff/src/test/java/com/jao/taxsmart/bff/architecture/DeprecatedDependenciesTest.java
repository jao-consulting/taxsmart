package com.jao.taxsmart.bff.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "com.jao.taxsmart.bff", importOptions = ImportOption.DoNotIncludeTests.class)
class DeprecatedDependenciesTest {
	@ArchTest
	static ArchRule rule = noClasses().should()
			.dependOnClassesThat()
			.areAnnotatedWith(Deprecated.class);
}
