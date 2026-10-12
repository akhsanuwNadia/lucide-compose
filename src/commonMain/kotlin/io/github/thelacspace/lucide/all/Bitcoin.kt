package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bitcoin") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.767f,19.089f)
                curveTo(16.691f,19.957f,17.907f,13.064001f,12.983f,12.195001f)
                moveTo(11.767f,19.089f)
                lineTo(5.86f,18.047f)
                moveTo(11.768f,19.089f)
                lineTo(11.421f,21.059f)
                moveTo(12.983999f,12.195f)
                curveTo(17.907999f,13.064f,19.123999f,6.1699996f,14.198999f,5.3019996f)
                moveTo(12.983999f,12.195f)
                lineTo(9.043999f,11.500999f)
                moveTo(14.198999f,5.3009996f)
                lineTo(8.29f,4.26f)
                moveTo(14.198f,5.302f)
                lineTo(14.546f,3.332f)
                moveTo(7.48f,20.364f)
                lineTo(10.606f,2.637001f)
            }
}

public val LucideIcons.All.BitcoinDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bitcoin: ImageVector
    @Composable get() = BitcoinDefinition.asImageVector()
