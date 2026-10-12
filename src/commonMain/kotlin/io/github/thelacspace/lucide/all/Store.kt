package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Store") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,21.0f)
                lineTo(15.0f,16.0f)
                curveTo(15.0f,15.447715f,14.552285f,15.0f,14.0f,15.0f)
                lineTo(10.0f,15.0f)
                curveTo(9.447715f,15.0f,9.0f,15.447715f,9.0f,16.0f)
                lineTo(9.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.774f,10.31f)
                curveTo(17.340899f,9.8953905f,16.658102f,9.8953905f,16.225f,10.31f)
                curveTo(15.259122f,11.231272f,13.739879f,11.231272f,12.774f,10.31f)
                curveTo(12.34103f,9.896028f,11.65897f,9.896028f,11.226f,10.31f)
                curveTo(10.25999f,11.231908f,8.74001f,11.231908f,7.774f,10.31f)
                curveTo(7.3408985f,9.8953905f,6.658102f,9.8953905f,6.2250004f,10.31f)
                curveTo(5.294404f,11.198034f,3.841831f,11.23497f,2.8673053f,10.395379f)
                curveTo(1.8927795f,9.555787f,1.7144122f,8.113733f,2.4550004f,7.0620003f)
                lineTo(5.3440003f,2.8780003f)
                curveTo(5.716202f,2.328777f,6.3365393f,1.9998779f,7.0f,2.0f)
                lineTo(17.0f,2.0f)
                curveTo(17.661463f,1.9997462f,18.280266f,2.3265555f,18.653f,2.8730001f)
                lineTo(21.548f,7.065f)
                curveTo(22.288794f,8.11761f,22.10928f,9.56066f,21.13317f,10.399691f)
                curveTo(20.15706f,11.238721f,18.703417f,11.199475f,17.774f,10.309f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,10.95f)
                lineTo(4.0f,19.0f)
                curveTo(4.0f,20.10457f,4.8954306f,21.0f,6.0f,21.0f)
                lineTo(18.0f,21.0f)
                curveTo(19.10457f,21.0f,20.0f,20.10457f,20.0f,19.0f)
                lineTo(20.0f,10.95f)
            }
}

public val LucideIcons.All.StoreDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Store: ImageVector
    @Composable get() = StoreDefinition.asImageVector()
