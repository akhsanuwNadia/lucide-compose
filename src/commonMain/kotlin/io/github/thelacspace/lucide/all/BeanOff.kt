package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeanOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,9.0f)
                curveTo(8.36f,9.64f,7.479f,9.954f,6.598f,10.165f)
                curveTo(3.639238f,10.873587f,1.6791617f,13.684537f,2.0370717f,16.70584f)
                curveTo(2.3949819f,19.727142f,4.957573f,22.002327f,8.0f,22.0f)
                curveTo(11.714008f,22.004677f,15.276782f,20.529184f,17.9f,17.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.75f,5.093f)
                curveTo(12.0747595f,2.6986399f,14.851706f,1.5039423f,17.501095f,2.1885445f)
                curveTo(20.150486f,2.8731468f,22.001032f,5.263589f,22.0f,8.0f)
                curveTo(22.0f,10.411f,21.39f,12.68f,20.317f,14.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.341f,10.62f)
                curveTo(5.875042f,11.826181f,6.969426f,12.691515f,8.266251f,12.933008f)
                curveTo(9.563076f,13.1745f,10.895584f,12.7611f,11.828f,11.828f)
                moveTo(10.62f,5.341f)
                curveTo(11.528885f,5.744971f,12.255475f,6.471917f,12.659f,7.381f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.BeanOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeanOff: ImageVector
    @Composable get() = BeanOffDefinition.asImageVector()
