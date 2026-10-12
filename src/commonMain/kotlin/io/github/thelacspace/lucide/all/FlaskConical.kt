package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskConical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,8.0f)
                curveTo(13.999858f,8.335484f,14.084109f,8.665613f,14.245f,8.96f)
                lineTo(19.755001f,19.04f)
                curveTo(20.094084f,19.659723f,20.081087f,20.412357f,19.72081f,21.020004f)
                curveTo(19.360533f,21.62765f,18.706423f,22.000164f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(5.293577f,22.000164f,4.6394672f,21.62765f,4.2791905f,21.020004f)
                curveTo(3.9189138f,20.412357f,3.9059174f,19.659723f,4.245f,19.04f)
                lineTo(9.755f,8.960001f)
                curveTo(9.915891f,8.665614f,10.000142f,8.335484f,10.0f,8.0f)
                lineTo(10.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.453f,15.0f)
                lineTo(17.547f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,2.0f)
                lineTo(15.5f,2.0f)
            }
}

public val LucideIcons.All.FlaskConicalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskConical: ImageVector
    @Composable get() = FlaskConicalDefinition.asImageVector()
