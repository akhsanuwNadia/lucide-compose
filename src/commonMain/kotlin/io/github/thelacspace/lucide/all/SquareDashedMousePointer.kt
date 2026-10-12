package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedMousePointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.034f,12.681f)
                curveTo(11.960317f,12.496147f,12.003753f,12.285175f,12.1444645f,12.144464f)
                curveTo(12.285176f,12.003752f,12.496148f,11.960316f,12.681001f,12.033999f)
                lineTo(21.681f,15.533999f)
                curveTo(21.878754f,15.611272f,22.006144f,15.80501f,21.998718f,16.017195f)
                curveTo(21.991293f,16.229382f,21.850672f,16.41374f,21.647999f,16.477f)
                lineTo(18.203999f,17.545f)
                curveTo(17.888523f,17.642538f,17.641537f,17.889524f,17.543999f,18.205f)
                lineTo(16.477f,21.648f)
                curveTo(16.41374f,21.850674f,16.229382f,21.991295f,16.017195f,21.99872f)
                curveTo(15.80501f,22.006145f,15.611272f,21.878756f,15.533999f,21.681002f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.0f)
                lineTo(10.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(11.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                lineTo(15.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(3.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,9.0f)
                lineTo(21.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,14.0f)
                lineTo(3.0f,15.0f)
            }
}

public val LucideIcons.All.SquareDashedMousePointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedMousePointer: ImageVector
    @Composable get() = SquareDashedMousePointerDefinition.asImageVector()
