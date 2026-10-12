package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartPie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                curveTo(21.552f,12.0f,22.005f,11.551f,21.95f,11.002f)
                curveTo(21.474669f,6.2685843f,17.730522f,2.525274f,12.997001f,2.0509996f)
                curveTo(12.4470005f,1.9959997f,11.999001f,2.4489996f,11.999001f,3.0009997f)
                lineTo(11.999001f,11.000999f)
                curveTo(11.999001f,11.553285f,12.446715f,12.000999f,12.999001f,12.000999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.21f,15.89f)
                curveTo(19.459848f,20.028883f,15.163822f,22.492044f,10.707771f,21.911535f)
                curveTo(6.2517204f,21.331028f,2.7301414f,17.849436f,2.098786f,13.400305f)
                curveTo(1.4674307f,8.951174f,3.8813725f,4.6273003f,8.0f,2.83f)
            }
}

public val LucideIcons.All.ChartPieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartPie: ImageVector
    @Composable get() = ChartPieDefinition.asImageVector()
