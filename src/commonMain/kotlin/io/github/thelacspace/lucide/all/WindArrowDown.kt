package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WindArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.8f,21.6f)
                curveTo(13.496147f,22.12211f,14.449999f,22.13418f,15.159133f,21.62985f)
                curveTo(15.868268f,21.12552f,16.169926f,20.220545f,15.905216f,19.3916f)
                curveTo(15.640506f,18.562656f,14.870184f,18.0f,14.0f,18.0f)
                lineTo(2.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f,10.0f)
                curveTo(18.20539f,9.059479f,19.47079f,8.737519f,20.539906f,9.226545f)
                curveTo(21.609022f,9.715572f,22.192955f,10.88344f,21.942707f,12.032148f)
                curveTo(21.69246f,13.180857f,20.675652f,14.0f,19.5f,14.0f)
                lineTo(2.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(10.0f,10.0f)
                lineTo(14.0f,6.0f)
            }
}

public val LucideIcons.All.WindArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WindArrowDown: ImageVector
    @Composable get() = WindArrowDownDefinition.asImageVector()
