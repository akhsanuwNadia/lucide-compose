package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9990336f,12.390571f,2.225546f,12.745961f,2.58f,12.91f)
                lineTo(7.673f,15.226f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                curveTo(22.003132f,12.396521f,21.771677f,12.757434f,21.41f,12.92f)
                lineTo(16.333f,15.228001f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.37f)
                lineTo(2.6f,7.91f)
                curveTo(2.2368176f,7.7503986f,2.0023181f,7.391204f,2.0023181f,6.9945f)
                curveTo(2.0023181f,6.597796f,2.2368176f,6.238601f,2.6f,6.079f)
                lineTo(11.17f,2.179f)
                curveTo(11.6973505f,1.9388412f,12.302939f,1.939206f,12.83f,2.1799998f)
                lineTo(21.42f,6.09f)
                curveTo(21.783182f,6.2496014f,22.017681f,6.608796f,22.017681f,7.0055f)
                curveTo(22.017681f,7.402204f,21.783182f,7.761399f,21.42f,7.921f)
                lineTo(16.028f,10.371f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                lineTo(12.0f,22.0f)
                lineTo(15.0f,19.0f)
            }
}

public val LucideIcons.All.LayersArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersArrowDown: ImageVector
    @Composable get() = LayersArrowDownDefinition.asImageVector()
