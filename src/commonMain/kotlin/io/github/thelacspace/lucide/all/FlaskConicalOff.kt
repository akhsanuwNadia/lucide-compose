package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskConicalOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,4.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,8.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(5.293577f,22.000164f,4.6394672f,21.62765f,4.2791905f,21.020004f)
                curveTo(3.9189138f,20.412357f,3.9059174f,19.659723f,4.245f,19.04f)
                lineTo(9.472f,9.477001f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.453f,15.0f)
                lineTo(15.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,2.0f)
                lineTo(15.5f,2.0f)
            }
}

public val LucideIcons.All.FlaskConicalOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskConicalOff: ImageVector
    @Composable get() = FlaskConicalOffDefinition.asImageVector()
