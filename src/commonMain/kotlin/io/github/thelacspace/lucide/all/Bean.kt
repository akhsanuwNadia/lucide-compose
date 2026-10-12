package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bean") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.165f,6.598f)
                curveTo(9.954f,7.478f,9.64f,8.36f,9.0f,9.0f)
                curveTo(8.36f,9.64f,7.479f,9.954f,6.598f,10.165f)
                curveTo(3.639238f,10.873587f,1.6791617f,13.684537f,2.0370717f,16.70584f)
                curveTo(2.3949819f,19.727142f,4.957573f,22.002327f,8.0f,22.0f)
                curveTo(15.732f,22.0f,22.0f,15.732f,22.0f,8.0f)
                curveTo(22.002327f,4.957573f,19.727142f,2.3949819f,16.70584f,2.0370717f)
                curveTo(13.684537f,1.6791617f,10.873587f,3.639238f,10.165f,6.598f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.341f,10.62f)
                curveTo(6.0659933f,12.251468f,7.7843704f,13.204968f,9.5523405f,12.956808f)
                curveTo(11.320311f,12.708648f,12.709781f,11.318914f,12.957606f,9.550898f)
                curveTo(13.205432f,7.7828803f,12.251605f,6.064684f,10.62f,5.3399997f)
            }
}

public val LucideIcons.All.BeanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bean: ImageVector
    @Composable get() = BeanDefinition.asImageVector()
