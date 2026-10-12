package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Road") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                lineTo(12.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.077f,18.449f)
                curveTo(1.9040031f,19.052635f,2.0245492f,19.702475f,2.4025364f,20.203903f)
                curveTo(2.7805238f,20.70533f,3.3720634f,21.000126f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.627878f,21.000349f,21.219477f,20.70582f,21.597649f,20.204603f)
                curveTo(21.97582f,19.703388f,22.096666f,19.05367f,21.924f,18.45f)
                lineTo(17.924f,4.450001f)
                curveTo(17.678381f,3.591279f,16.893158f,2.9995039f,16.0f,3.0f)
                lineTo(8.0f,3.0f)
                curveTo(7.1068425f,2.9995036f,6.3216186f,3.5912786f,6.076f,4.45f)
                close()
            }
}

public val LucideIcons.All.RoadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Road: ImageVector
    @Composable get() = RoadDefinition.asImageVector()
