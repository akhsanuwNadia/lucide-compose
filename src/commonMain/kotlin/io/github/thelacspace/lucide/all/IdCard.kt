package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IdCard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,19.0f)
                curveTo(12.990151f,16.797844f,11.202178f,15.017849f,9.0f,15.017849f)
                curveTo(6.7978215f,15.017849f,5.0098486f,16.797844f,5.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,10.0f)
                lineTo(18.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(18.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                curveTo(5.9951925f,13.074993f,6.5659356f,14.070391f,7.496114f,14.60928f)
                curveTo(8.426291f,15.148169f,9.573709f,15.148169f,10.503886f,14.60928f)
                curveTo(11.434065f,14.070391f,12.004807f,13.074993f,12.0f,12.0f)
                curveTo(12.004807f,10.925007f,11.434065f,9.929609f,10.503886f,9.39072f)
                curveTo(9.573709f,8.851831f,8.426291f,8.851831f,7.496114f,9.39072f)
                curveTo(6.5659356f,9.929609f,5.9951925f,10.925007f,6.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,5.0f)
                lineTo(20.0f,5.0f)
                lineTo(22.0f,5.0f)
                lineTo(22.0f,19.0f)
                lineTo(20.0f,19.0f)
                lineTo(4.0f,19.0f)
                lineTo(2.0f,19.0f)
                lineTo(2.0f,5.0f)
                lineTo(4.0f,5.0f)
                close()
            }
}

public val LucideIcons.All.IdCardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IdCard: ImageVector
    @Composable get() = IdCardDefinition.asImageVector()
