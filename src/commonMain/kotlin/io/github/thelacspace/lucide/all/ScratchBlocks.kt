package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScratchBlocks") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                curveTo(20.10457f,5.0f,21.0f,5.8954306f,21.0f,7.0f)
                lineTo(21.0f,18.0f)
                curveTo(21.0f,19.10457f,20.10457f,20.0f,19.0f,20.0f)
                lineTo(13.414f,20.0f)
                curveTo(13.148805f,20.000057f,12.894492f,20.10545f,12.707f,20.293f)
                lineTo(11.292999f,21.706999f)
                curveTo(11.105507f,21.894548f,10.851194f,21.99994f,10.5859995f,21.999998f)
                lineTo(8.414f,21.999998f)
                curveTo(8.148805f,21.99994f,7.8944926f,21.894548f,7.707f,21.706999f)
                lineTo(6.2929997f,20.293f)
                curveTo(6.105507f,20.10545f,5.8511944f,20.000057f,5.586f,20.0f)
                lineTo(5.0f,20.0f)
                curveTo(3.8954306f,20.0f,3.0f,19.10457f,3.0f,18.0f)
                lineTo(3.0f,5.286f)
                curveTo(3.0f,4.8919997f,3.11f,4.501f,3.3600001f,4.1959996f)
                curveTo(4.480325f,2.8293538f,6.1461415f,2.0260835f,7.913114f,2.0004501f)
                curveTo(9.680086f,1.9748167f,11.368503f,2.7294273f,12.528f,4.0629997f)
                curveTo(12.996f,4.6f,13.637f,5.0f,14.35f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                lineTo(13.414f,12.0f)
                curveTo(13.148805f,12.000057f,12.894492f,12.105451f,12.707f,12.293f)
                lineTo(11.292999f,13.707001f)
                curveTo(11.105507f,13.89455f,10.851194f,13.999944f,10.5859995f,14.000001f)
                lineTo(8.414f,14.000001f)
                curveTo(8.148805f,13.999944f,7.8944926f,13.89455f,7.707f,13.707001f)
                lineTo(6.2929997f,12.293001f)
                curveTo(6.1055074f,12.105452f,5.851195f,12.000057f,5.586f,12.0f)
                lineTo(3.0f,12.0f)
            }
}

public val LucideIcons.All.ScratchBlocksDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScratchBlocks: ImageVector
    @Composable get() = ScratchBlocksDefinition.asImageVector()
