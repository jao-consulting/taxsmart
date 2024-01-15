<template>
  <NuxtLayout>
    <NuxtPage />
  </NuxtLayout>
</template>

<script setup lang="ts">
import { useI18n } from "vue-i18n";

const { t } = useI18n();
const { locale } = useI18n();

useSeoMeta({
  title: t("app.title"),
});

useHead({
  htmlAttrs: {
    lang: locale.value,
  },
});
</script>
