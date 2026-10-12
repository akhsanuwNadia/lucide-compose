package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareBottomDashedScissors") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,21.0f)
                lineTo(15.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,17.0f)
                lineTo(14.82f,14.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.56f,14.44f)
                lineTo(17.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.56f,9.56f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.5f)
                curveTo(6.9975963f,16.037497f,7.2829676f,16.535194f,7.748057f,16.80464f)
                curveTo(8.213146f,17.074085f,8.786854f,17.074085f,9.251944f,16.80464f)
                curveTo(9.717032f,16.535194f,10.002404f,16.037497f,10.0f,15.5f)
                curveTo(10.002404f,14.962503f,9.717032f,14.464805f,9.251944f,14.19536f)
                curveTo(8.786854f,13.925916f,8.213146f,13.925916f,7.748057f,14.19536f)
                curveTo(7.2829676f,14.464805f,6.9975963f,14.962503f,7.0f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,8.5f)
                curveTo(6.9975963f,9.037497f,7.2829676f,9.535195f,7.748057f,9.80464f)
                curveTo(8.213146f,10.074084f,8.786854f,10.074084f,9.251944f,9.80464f)
                curveTo(9.717032f,9.535195f,10.002404f,9.037497f,10.0f,8.5f)
                curveTo(10.002404f,7.9625034f,9.717032f,7.4648046f,9.251944f,7.19536f)
                curveTo(8.786854f,6.9259157f,8.213146f,6.9259157f,7.748057f,7.19536f)
                curveTo(7.2829676f,7.4648046f,6.9975963f,7.9625034f,7.0f,8.5f)
            }
}

public val LucideIcons.All.SquareBottomDashedScissorsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareBottomDashedScissors: ImageVector
    @Composable get() = SquareBottomDashedScissorsDefinition.asImageVector()
