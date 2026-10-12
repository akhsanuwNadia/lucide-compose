package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Feather") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.086f,18.412f)
                curveTo(13.710853f,18.788322f,13.20137f,18.999887f,12.67f,19.0f)
                lineTo(5.0f,19.0f)
                lineTo(5.0f,11.328f)
                curveTo(5.000113f,10.79761f,5.2109013f,10.288985f,5.586f,9.914f)
                lineTo(11.75f,3.75f)
                curveTo(13.264312f,2.2220824f,15.480401f,1.621196f,17.559132f,2.1748703f)
                curveTo(19.637861f,2.7285442f,21.261456f,4.3521385f,21.81513f,6.430868f)
                curveTo(22.368803f,8.509599f,21.767918f,10.725688f,20.24f,12.24f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                lineTo(2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.488f,15.0f)
                lineTo(9.0f,15.0f)
            }
}

public val LucideIcons.All.FeatherDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Feather: ImageVector
    @Composable get() = FeatherDefinition.asImageVector()
