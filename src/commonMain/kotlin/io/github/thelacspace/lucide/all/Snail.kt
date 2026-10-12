package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Snail") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                curveTo(1.9903849f,15.149985f,3.131871f,17.140781f,4.9922276f,18.21856f)
                curveTo(6.8525834f,19.296337f,9.147416f,19.296337f,11.007772f,18.21856f)
                curveTo(12.868129f,17.140781f,14.009615f,15.149985f,14.0f,13.0f)
                curveTo(14.00641f,11.566676f,13.2454195f,10.239479f,12.005181f,9.520961f)
                curveTo(10.764944f,8.802442f,9.235056f,8.802442f,7.994818f,9.520961f)
                curveTo(6.7545805f,10.239479f,5.99359f,11.566676f,6.0f,13.0f)
                curveTo(6.0049243f,14.101078f,6.898911f,14.9910755f,8.0f,14.9910755f)
                curveTo(9.1010895f,14.9910755f,9.995076f,14.101078f,10.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                curveTo(1.9871799f,15.866648f,3.5091612f,18.521042f,5.9896364f,19.958078f)
                curveTo(8.470112f,21.395117f,11.529888f,21.395117f,14.010364f,19.958078f)
                curveTo(16.490839f,18.521042f,18.01282f,15.866648f,18.0f,13.0f)
                curveTo(18.01282f,10.133352f,16.490839f,7.478958f,14.010364f,6.0419207f)
                curveTo(11.529888f,4.6048837f,8.470112f,4.6048837f,5.9896364f,6.0419207f)
                curveTo(3.5091612f,7.478958f,1.9871799f,10.133352f,2.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(14.0f,21.0f)
                curveTo(18.4f,21.0f,22.0f,17.4f,22.0f,13.0f)
                lineTo(22.0f,7.0f)
                curveTo(22.003204f,6.283338f,21.62271f,5.6197395f,21.00259f,5.2604804f)
                curveTo(20.382473f,4.901221f,19.617527f,4.901221f,18.99741f,5.2604804f)
                curveTo(18.37729f,5.6197395f,17.996796f,6.283338f,18.0f,7.0f)
                lineTo(18.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,3.0f)
                lineTo(19.1f,5.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,3.0f)
                lineTo(20.9f,5.2f)
            }
}

public val LucideIcons.All.SnailDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Snail: ImageVector
    @Composable get() = SnailDefinition.asImageVector()
