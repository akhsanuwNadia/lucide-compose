package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.114f,4.462f)
                curveTo(10.652842f,3.5762682f,11.285124f,2.7508814f,12.0f,2.0f)
                curveTo(15.304778f,1.9999394f,18.39617f,3.6326282f,20.259369f,6.3621054f)
                curveTo(22.122568f,9.091582f,22.51693f,12.565321f,21.313f,15.643f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.557f,15.556f)
                curveTo(14.945332f,17.97419f,13.720192f,20.193699f,12.0f,22.0f)
                curveTo(7.9554195f,21.999945f,4.309119f,19.563524f,2.7613325f,15.826816f)
                curveTo(1.213546f,12.090108f,2.069077f,7.7889776f,4.929f,4.929f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.892f,10.234f)
                curveTo(15.512675f,7.142564f,14.148001f,4.2554293f,12.0f,2.0f)
                curveTo(10.753462f,1.9999416f,9.517901f,2.2329447f,8.357f,2.687f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.656f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.071f,19.071f)
                curveTo(17.195663f,20.946371f,14.652151f,21.999964f,12.0f,22.0f)
                curveTo(8.565303f,18.394302f,7.221178f,13.27832f,8.44f,8.45f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.GlobeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeOff: ImageVector
    @Composable get() = GlobeOffDefinition.asImageVector()
